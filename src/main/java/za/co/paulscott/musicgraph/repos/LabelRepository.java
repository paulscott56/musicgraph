/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.label.MusicLabel;

/**
 * @author paul
 *
 */
public interface LabelRepository extends GraphRepository<MusicLabel> {

}
