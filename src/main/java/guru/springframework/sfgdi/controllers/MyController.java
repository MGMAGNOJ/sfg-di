package guru.springframework.sfgdi.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;



@Controller
public class MyController {

    private static final Logger logger = Logger.getLogger( MyController.class.getName() );

    public String SayHello(){
        
        logger.log(Level.INFO,"Hello I'm Controller!!!");
        return "Good Bye!";
    }
}
