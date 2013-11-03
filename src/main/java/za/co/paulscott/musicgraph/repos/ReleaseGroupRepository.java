/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.releasegroup.ReleaseGroup;

/**
 * @author paul
 *
 */
public interface ReleaseGroupRepository extends GraphRepository<ReleaseGroup> {

}
