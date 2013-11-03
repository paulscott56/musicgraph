/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.geo.Country;

/**
 * @author paul
 *
 */
public interface GeoRepository extends GraphRepository<Country> {

}
