package za.co.paulscott.musicgraph.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import za.co.paulscott.musicgraph.config.AppConfig;
import za.co.paulscott.musicgraph.entities.CountryEntity;
import za.co.paulscott.musicgraph.iface.Country;
import za.co.paulscott.musicgraph.iface.HelloWorld;
import za.co.paulscott.musicgraph.impl.CountryImpl;
import za.co.paulscott.musicgraph.services.CountryService;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHelloWorld("Music lovers");
		
		CountryService cs = (CountryService) context.getBean("countryService");
		
		cs.saveCountry();

	}

}
