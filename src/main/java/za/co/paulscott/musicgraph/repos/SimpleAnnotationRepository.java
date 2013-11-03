package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;

import za.co.paulscott.musicgraph.entities.shared.SimpleAnnotation;

public interface SimpleAnnotationRepository extends
		GraphRepository<SimpleAnnotation> {

}
