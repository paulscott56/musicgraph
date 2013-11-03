/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.release.Release;

/**
 * @author paul
 *
 */
public interface ReleaseRepository extends GraphRepository<Release> {

}
