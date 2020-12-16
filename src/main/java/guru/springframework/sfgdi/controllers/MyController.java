package guru.springframework.sfgdi.controllers;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;



@Controller
public class MyController {

    private static final Logger logger = Logger.getLogger( MyController.class.getName() );
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String SayHello(){
        
        logger.log(Level.INFO,"Hello I'm Controller!!!");
    
        return greetingService.sayGreeting();
    }
}
