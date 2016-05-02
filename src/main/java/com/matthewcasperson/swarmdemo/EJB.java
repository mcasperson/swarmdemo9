package com.matthewcasperson.swarmdemo;

import org.apache.commons.lang3.StringUtils;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple EJB that will log to the console when it is started up. Note that
 * we make use of o=some third party libraries (Apache Commons Lang in this case)
 * just to prove that we can build a self contained EJB JAR file.
 */
@Startup
@Singleton
public class EJB {
    private static final Logger LOGGER = Logger.getLogger(EJB.class.getName());

    /*
        This method will be called by the EJB container when the instance is constructed.
     */
    @PostConstruct
    public void postConstruct() {
        /*
            Notice that we have made use of the Apache Lang library here to trim our log message.
         */
        LOGGER.log(Level.INFO, StringUtils.trim("  EJB.postConstruct() called"));
    }
}
