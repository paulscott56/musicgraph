package za.co.paulscott.musicgraph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import za.co.paulscott.musicgraph.hello.HelloWorld;
import za.co.paulscott.musicgraph.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
	
	@Bean
	public Something something() {
		return null;
	}

}
