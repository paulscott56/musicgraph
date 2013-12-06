package za.co.paulscott.musicgraph.repos;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import za.co.paulscott.musicgraph.entities.Artist;

@Repository
@Transactional
public interface ArtistRepository extends GraphRepository<Artist> {}