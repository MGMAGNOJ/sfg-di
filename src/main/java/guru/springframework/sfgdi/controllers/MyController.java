package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String SayHello(){
        System.out.println("Hello!");
        return "Good Bye!";
    }

}
