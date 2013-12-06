package za.co.paulscott.musicgraph.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;

import za.co.paulscott.musicgraph.iface.HelloWorld;
import za.co.paulscott.musicgraph.impl.CountryImpl;
import za.co.paulscott.musicgraph.impl.HelloWorldImpl;
import za.co.paulscott.musicgraph.services.CountryService;

@Configuration
@EnableNeo4jRepositories("za.co.paulscott.musicgraph.repos")
public class AppConfig extends Neo4jConfiguration {

    @Bean
    public GraphDatabaseService graphDatabaseService() {
        return new SpringRestGraphDatabase("http://localhost:7474/db/data/");
        
    }

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

	@Bean(name= "countryImpl")
	public CountryImpl countryImpl() {
		return new CountryImpl();
	}
	
	@Bean(name="countryService")
	public CountryService countryService() {
		return new CountryService();
	}

}
