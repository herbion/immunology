import play.test.*;
import play.jobs.*;
import models.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@OnApplicationStart
public class Bootstrap extends Job {
    private final static Logger log = LoggerFactory.getLogger(Bootstrap.class);

    public void doJob() {
    	log.info("Loading Fixtures...");
		// Fixtures.delete();
		// Fixtures.loadModels("data.yml");
    }
    
}