/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.shared.DisambiguationComment;

/**
 * @author paul
 *
 */
public interface DisambiguationCommentRepository extends
		GraphRepository<DisambiguationComment> {

}
