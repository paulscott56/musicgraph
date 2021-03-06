package za.co.paulscott.musicgraph.services;

import org.neo4j.graphdb.DynamicRelationshipType;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.rest.graphdb.RestGraphDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.aspects.support.node.Neo4jNodeBacking;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.data.neo4j.support.Neo4jExceptionTranslator;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.data.neo4j.support.node.NodeEntityStateFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import za.co.paulscott.musicgraph.entities.CountryEntity;
import za.co.paulscott.musicgraph.repos.GeoRepository;

@Service
public class CountryService {

	@Autowired
	Neo4jTemplate template;

	@Autowired
	GraphDatabaseService graphDb;

	@Autowired
	private GeoRepository countryRepo;
	
	public long setupCountryNode() {
		Transaction tx = graphDb.beginTx();
		try {
			Node countryNode = graphDb.createNode();
			countryNode.setProperty("name", "Countries");
			template.findOne(countryNode.getId(), CountryEntity.class);
			tx.success();
			return countryNode.getId();
		} finally {
			tx.finish();
		}
	}
	
	public void getCountryRootNode() {
		Transaction tx = graphDb.beginTx();
//		try {
//			Node countryNode = template.
//		} finally {
//			tx.finish();
//		}
	}

	public void saveCountry(CountryEntity country) {
		Transaction tx = graphDb.beginTx();
		try {			
			countryRepo.save(country);
			tx.success();
		} finally {
			tx.finish();
		}
	}
}
