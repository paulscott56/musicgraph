/**
 * 
 */
package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.recording.Recording;

/**
 * @author paul
 *
 */
public interface RecordingRepository extends GraphRepository<Recording> {

}
