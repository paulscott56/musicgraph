package za.co.paulscott.musicgraph.entities.recording;

import za.co.paulscott.musicgraph.entities.artist.Artist;
import za.co.paulscott.musicgraph.entities.shared.DisambiguationComment;
import za.co.paulscott.musicgraph.entities.shared.SimpleAnnotation;

/**
 * A recording is an entity in MusicGraph which can be linked to tracks on releases. 
 * Each track must always be associated with a single recording, but a recording can be linked to any number of tracks.
 * 
 * A recording represents distinct audio that has been used to produce at least one released track through copying or mastering. 
 * A recording itself is never produced solely through copying or mastering.
 * 
 * Generally, the audio represented by a recording corresponds to the audio at a stage in the production 
 * process before any final mastering but after any editing or mixing.
 * 
 * @author paul
 *
 */
public class Recording {

	/**
	 * Title
	 * The title of the recording
	 */
	private String title;
	
	/**
	 * Artist
	 * The artist(s) that the recording is primarily credited to.
	 */
	private Artist artist;
	
	/**
	 * Duration
	 * An approximation to the length of the recording, calculated from the lengths of the tracks using it.
	 */
	private double duration;
	
	/**
	 * ISRC
	 * The International Standard Recording Code assigned to the recording.
	 */
	private String isrcString;

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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getIsrcString() {
		return isrcString;
	}

	public void setIsrcString(String isrcString) {
		this.isrcString = isrcString;
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
