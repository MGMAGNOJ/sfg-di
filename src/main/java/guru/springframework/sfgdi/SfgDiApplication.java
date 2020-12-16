package guru.springframework.sfgdi;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	private static final Logger logger = Logger.getLogger( SfgDiApplication.class.getName() );
	public static void main(String[] args) 
	
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greetings = myController.SayHello();


		logger.log(Level.INFO, greetings);

		logger.log(Level.INFO,"Property!!!");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		logger.log(Level.INFO,propertyInjectedController.getGreeting());

		logger.log(Level.INFO,"Setter!!!");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		logger.log(Level.INFO,setterInjectedController.getGreeting());

		logger.log(Level.INFO,"Constructor!!!");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		logger.log(Level.INFO, constructorInjectedController.getGreeting());


	}

}
