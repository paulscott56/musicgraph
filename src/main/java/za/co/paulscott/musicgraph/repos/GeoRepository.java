/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import za.co.paulscott.musicgraph.entities.CountryEntity;

/**
 * @author paul
 *
 */
@Repository
public interface GeoRepository extends GraphRepository<CountryEntity> {

}
