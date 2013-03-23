## don't run me twice
import os, re
listdir = []

def make_js_name(name):
	clean_name = name.replace('.\\app\\views\\', '').replace('\\', '-').replace('html', 'js')
	return re.sub('(.)([A-Z]{1})', r'\1-\2', clean_name).lower()
def write_js_to_file(js_name, content):
	content = content.replace('<script type="text/javascript">', '').replace('</script>', '')
	file = open('.\\public\\javascripts\\' + js_name, 'w')
	file.write('content')
	file.close()
def rewrite_old_file(file_name, old_content, js_name):
	template = "<script>\n    #{include '/public/javascripts/%s'/}\n</script>\n"
	replace_this = re.findall(ur'<script type="text/javascript">.+</script>', old_content, re.DOTALL)[0]
	after_sub = old_content.replace(replace_this, template % js_name)
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
	result = re.finditer(ur'<script type="text/javascript">.+</script>', txt, re.DOTALL)

	for match in result : 
	  content = match.group()
	  js_name = make_js_name(f)
	  if "#{include '/public/javascripts" in content:
	  	next

	  print '>' * 10, 'found inline js in file -> ' + f
	  print content
	  print '<' * 10, 'found inline js in file -> ' + f
	  print 'new js name', js_name

	  #write_js_to_file(js_name, content)
	  #rewrite_old_file(f, txt, js_name) 
