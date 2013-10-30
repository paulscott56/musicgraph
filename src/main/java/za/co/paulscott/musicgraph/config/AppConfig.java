package za.co.paulscott.musicgraph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import za.co.paulscott.musicgraph.hello.HelloWorld;
import za.co.paulscott.musicgraph.hello.impl.HelloWorldImpl;
import za.co.paulscott.musicgraph.services.country.CountryService;

@Configuration
public class AppConfig {

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

	/**
	 * <bean id="springExampleDao"
	 * class="com.impetus.kundera.examples.spring.SpringExampleDao"> <property
	 * name="entityManagerFactory" ref="entityManagerFactory" /> </bean> <bean
	 * id="entityManagerFactory" class=
	 * "org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
	 * <property name="persistenceUnitName" value="cassandra_pu" /> </bean>
	 */
	@Bean
	public CountryService countryService() {
		return new CountryService();
	}

}
