## don't run me twice
import os, re
listdir = []

def make_css_name(name):
	clean_name = name.replace('.\\app\\views\\', '').replace('\\', '-').replace('html', 'css')
	return re.sub('(.)([A-Z]{1})', r'\1-\2', clean_name).lower()
def write_css_to_file(css_name, content):
	content = content.replace('<style>', '').replace('</style>', '')
	file = open('.\\public\\stylesheets\\' + css_name, 'w')
	file.write(content)
	file.close()
def rewrite_old_file(file_name, old_content, css_name):
	replace_this = re.findall(ur'<style>.+</style>', old_content, re.DOTALL)[0]
	after_sub = old_content.replace(replace_this, "#{stylesheet '%s'/}" % css_name)
	print "*" * 10
	print ">" * 10, after_sub
	print "*" * 10
	if "y" == raw_input('Rewrite? y/n: '):
		print "Okay rewriting"
		file = open(f, 'w')
		file.write(after_sub)
		file.close()



for root, dirs, files in os.walk('.'):
    for one_file in files:
        listdir.append(os.path.join(root, one_file))
listdir = filter(lambda f: f.endswith('html') and f.startswith(".\\app\\views"), listdir)

for f in listdir:
	txt = open(f, 'r').read() 
	result = re.finditer(ur"<style>.+</style>", txt, re.DOTALL)
	
	for match in result : 
	  content = match.group()
	  css_name = make_css_name(f)

	  print '>' * 10, 'found inline css in file -> ' + f
	  print content
	  print '<' * 10, 'found inline css in file -> ' + f
	  print 'new css name', css_name

	  if "y" == raw_input('Rewrite? y/n: '):
	  	#write_css_to_file(css_name, content)
	  	#rewrite_old_file(f, txt, css_name) 
