package za.co.paulscott.musicgraph.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import za.co.paulscott.musicgraph.config.AppConfig;
import za.co.paulscott.musicgraph.hello.HelloWorld;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");

		obj.printHelloWorld("Music lovers");

	}

}
