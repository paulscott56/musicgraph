package za.co.paulscott.musicgraph.services.country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.paulscott.musicgraph.entities.geo.Country;

@Service
public class CountryService {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	public void CountryService() {
		this.entityManager.setProperty("persistenceUnitName", "neo4j_pu");
	}
	
	public Country addCoountry(Country country)
    {
        entityManager.persist(country);
        entityManager.close();
        return country;
    }

}
