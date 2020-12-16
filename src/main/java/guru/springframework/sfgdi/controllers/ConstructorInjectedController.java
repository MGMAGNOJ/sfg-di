package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final  GreetingService greetingService;
 
    // @Autowired aqui é opcional no Construtor.
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}