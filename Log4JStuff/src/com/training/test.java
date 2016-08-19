package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class test {
    
    static Logger log=Logger.getLogger("example");

    public static void main(String[] args) {

        BasicConfigurator.configure();
        
        PatternLayout layout = new PatternLayout("%d [%t] %-5p %c %x - %m%n");
        
        log.addAppender(new ConsoleAppender(layout));
        
        try {
            log.info("inside try block");
            
        } catch (Exception e) {
            // TODO: handle exception
            log.warn("exception message");

            
        }
        
        

    }


    

}
