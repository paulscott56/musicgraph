package za.co.paulscott.musicgraph.entities.work;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;

import za.co.paulscott.musicgraph.entities.shared.DisambiguationComment;
import za.co.paulscott.musicgraph.entities.shared.ISWCCode;
import za.co.paulscott.musicgraph.entities.shared.SimpleAnnotation;

/**
 * In MusicGraph terminology, a work is a distinct intellectual or artistic
 * creation, which can be expressed in the form of one or more audio recordings.
 * 
 * While a work in MusicGraph is usually musical in nature, it is not
 * necessarily so. For example, a work could be a novel, play, poem or essay,
 * later recorded as an oratory or audiobook.
 * 
 * Distinctiveness A work’s distinctiveness is based on the artists who
 * contributed to its final output, and whether a work is derived from another
 * original work. Examples of works that are distinct:
 * 
 * a work that is written by an individual songwriter a work that is the result
 * of a collaboration between composer and lyricist an instrumental work where
 * an artist later adds lyrics translation of an original work into a different
 * language a parody of an original work with differing lyrics a medley of
 * multiple original works a mashup of multiple original works
 * 
 * Types of works Works are represented predominantly at two levels:
 * 
 * Discrete works An individual song, musical number or movement. This includes
 * recitatives, arias, choruses, duos, trios, etc. In many cases, discrete works
 * are a part of larger, aggregate works.
 * 
 * Aggregate works An ordered sequence of one or more songs, numbers or
 * movements, such as: symphony, opera, theatre work, concerto, and concept
 * album. A popular music album is not considered a distinct aggregate work
 * unless it is evident that such an album was written with intent to have a
 * specifically ordered sequence of related songs (i.e. a “concept album”).
 * 
 * @author paul
 * 
 */
@NodeEntity
public class Work {

	/**
	 * Name
	 * 
	 * The canonical title of the work, expressed in the language it was
	 * originally written.
	 */
	private String name;

	/**
	 * Type
	 * 
	 * The type of work.
	 */
	private String type;

	/**
	 * Aliases If a discrete work is known by name(s) or in language(s) other
	 * than its canonical name, these are specified in the work’s aliases.
	 */
	private Set<String> aliases;

	/**
	 * ISWC The International Standard Musical Work Code assigned to the work by
	 * copyright collecting agencies.
	 */
	private ISWCCode iswc;

	/**
	 * Disambiguation comment
	 */
	private DisambiguationComment comment;

	/**
	 * Annotation
	 */
	private SimpleAnnotation annotation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<String> getAliases() {
		return aliases;
	}

	public void setAliases(Set<String> aliases) {
		this.aliases = aliases;
	}

	public ISWCCode getIswc() {
		return iswc;
	}

	public void setIswc(ISWCCode iswc) {
		this.iswc = iswc;
	}

	public DisambiguationComment getComment() {
		return comment;
	}

	public void setComment(DisambiguationComment comment) {
		this.comment = comment;
	}

	public SimpleAnnotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(SimpleAnnotation annotation) {
		this.annotation = annotation;
	}
}
