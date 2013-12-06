package za.co.paulscott.musicgraph.entities;

import org.springframework.data.neo4j.annotation.NodeEntity;

import za.co.paulscott.musicgraph.enums.ReleaseType;

/**
 * A release group, just as the name suggests, is used to group several
 * different releases into a single logical entity. Every release belongs to
 * one, and only one release group.
 * 
 * Both release groups and releases are "albums" in a general sense, but with an
 * important difference: a release is something you can buy as media such as a
 * CD or a vinyl record, while a release group embraces the overall concept of
 * an album -- it doesn't matter how many CDs or editions/versions it had.
 * 
 * When an artist says "We've released our new album", they're talking about a
 * release group. When their publisher says
 * "This new album gets released next week in Japan and next month in Europe",
 * they're referring to the different releases that belong in the above
 * mentioned release group.
 * 
 * MusicGraph automatically considers every release in the database to be part
 * of a release group, even if this group only contains the one release. When a
 * brand new release is added to the database, a new release group is
 * automatically added as well.
 * 
 * @author paul
 * 
 */
@NodeEntity
public class ReleaseGroup {

	/**
	 * Title The title of a release group is usually very similar, if not the
	 * same, as the titles of the releases contained within it.
	 */
	private String title;

	/**
	 * Artist The artist of a release group is usually very similar, if not the
	 * same, as the artist of the releases contained within it. Multiple artists
	 * can be linked using artist credits.
	 */
	private Artist artist;

	/**
	 * Type The type describes what kind of releases the release group
	 * represents, for example album, single, soundtrack, compilation etc.
	 */
	private ReleaseType releaseType;

	/**
	 * Disambiguation comment
	 */
	private DisambiguationComment comment;

	/**
	 * Annotation
	 */
	private SimpleAnnotation annotation;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public ReleaseType getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(ReleaseType releaseType) {
		this.releaseType = releaseType;
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
