package guru.springframework.sfgdi;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.examplebeans.FakeDatasourse;
import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	private static final Logger logger = Logger.getLogger( SfgDiApplication.class.getName() );
	public static void main(String[] args) 
	
	{
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		logger.log(Level.INFO, i18nController.sayHello());


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


		logger.log(Level.INFO,"FakeDataSource!!!");
		FakeDatasourse fakeDatasourse = ctx.getBean(FakeDatasourse.class);

		logger.log(Level.INFO,"Source SO!!!");
	
		logger.log(Level.INFO, fakeDatasourse.getSoUsername());

		logger.log(Level.INFO,"Source DT1!!!");
	
		logger.log(Level.INFO, fakeDatasourse.getDt1Username());
		logger.log(Level.INFO, fakeDatasourse.getDt1Password());
		logger.log(Level.INFO, fakeDatasourse.getDt1Url());


		logger.log(Level.INFO,"Source DT2!!!");
	
		logger.log(Level.INFO, fakeDatasourse.getDt2Username());
		logger.log(Level.INFO, fakeDatasourse.getDt2Password());
		logger.log(Level.INFO, fakeDatasourse.getDt2Url());

	}

}
