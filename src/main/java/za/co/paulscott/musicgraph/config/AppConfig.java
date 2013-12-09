package za.co.paulscott.musicgraph.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.neo4j.aspects.config.Neo4jAspectConfiguration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import za.co.paulscott.musicgraph.iface.HelloWorld;
import za.co.paulscott.musicgraph.impl.HelloWorldImpl;
import za.co.paulscott.musicgraph.services.CountryService;

@Configuration
@Import(Neo4jAspectConfiguration.class)
@EnableTransactionManagement
@EnableNeo4jRepositories("za.co.paulscott.musicgraph.repos")
@EnableSpringConfigured
public class AppConfig extends Neo4jConfiguration {

	@Bean
	public GraphDatabaseService graphDatabaseService() {
		//return new SpringRestGraphDatabase("http://localhost:7474/db/data/");
		GraphDatabaseService service = new GraphDatabaseFactory().newEmbeddedDatabase("/tmp/graphdb");
		return service;
	}

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

	@Bean
	public JtaTransactionManager transactionManager() {
		return new JtaTransactionManager();
	}

	@Bean(name = "countryService")
	public CountryService countryService() {
		return new CountryService();
	}

}
