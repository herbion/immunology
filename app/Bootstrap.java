import java.util.List;
import java.util.Map;
import java.util.Set;

import play.test.*;
import play.deps.YamlParser;
import play.jobs.*;
import models.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OnApplicationStart
public class Bootstrap extends Job {
    private final static Logger log = LoggerFactory.getLogger(Bootstrap.class);
    
    @Override
    public void doJob() {
  //   	log.warn("Loading Fixtures...");
  //   	String usersYaml = "fixtures/User.yml";

  //   	List<User> list = (List<User>) Fixtures.loadYamlAsList(usersYaml);
  //   	for (User user : list) {
  //   		    	log.warn(user.toString());
		// }

    	
//		log.warn("Loaded:" + Fixtures.loadYaml(usersYaml, Set.class).toString());
    	
		// Fixtures.delete();
		// Fixtures.loadModels("data.yml");
    }
    
}