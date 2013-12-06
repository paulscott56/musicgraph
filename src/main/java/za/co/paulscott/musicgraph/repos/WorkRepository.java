package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import za.co.paulscott.musicgraph.entities.Work;

@Repository
@Transactional
public interface WorkRepository extends GraphRepository<Work> {

}
