/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import za.co.paulscott.musicgraph.entities.DisambiguationComment;

/**
 * @author paul
 *
 */
@Repository
@Transactional
public interface DisambiguationCommentRepository extends
		GraphRepository<DisambiguationComment> {

}
