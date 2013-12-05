package za.co.paulscott.musicgraph.config;

import org.neo4j.rest.graphdb.RestGraphDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

import za.co.paulscott.musicgraph.hello.HelloWorld;
import za.co.paulscott.musicgraph.hello.impl.HelloWorldImpl;
import za.co.paulscott.musicgraph.services.country.CountryService;

@Configuration
@EnableNeo4jRepositories("za.co.paulscott.musicgraph.repos")
public class AppConfig extends Neo4jConfiguration {

    @Bean
    public RestGraphDatabase graphDatabaseService() {
        return new RestGraphDatabase("http://localhost:7474/db/data/");
        
    }

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

	@Bean
	public CountryService countryService() {
		return new CountryService();
	}

}
