package za.co.paulscott.musicgraph.entities;

import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * A recording is an entity in MusicGraph which can be linked to tracks on
 * releases. Each track must always be associated with a single recording, but a
 * recording can be linked to any number of tracks.
 * 
 * A recording represents distinct audio that has been used to produce at least
 * one released track through copying or mastering. A recording itself is never
 * produced solely through copying or mastering.
 * 
 * Generally, the audio represented by a recording corresponds to the audio at a
 * stage in the production process before any final mastering but after any
 * editing or mixing.
 * 
 * @author paul
 * 
 */
@NodeEntity
public class Recording {

	/**
	 * Title The title of the recording
	 */
	private String title;

	/**
	 * Artist The artist(s) that the recording is primarily credited to.
	 */
	private Artist artist;

	/**
	 * Duration An approximation to the length of the recording, calculated from
	 * the lengths of the tracks using it.
	 */
	private double duration;

	/**
	 * ISRC The International Standard Recording Code assigned to the recording.
	 * 
	 * The ISRC is a 12-byte alphanumeric string (only uppercase latin letters
	 * and arabic numerals, [A-Z0-9]) of the form CCOOOYYSSSSS with C a
	 * 2-character country code (containing only letters) as defined in ISO
	 * 3166-1 O a 3-character owner code (containing letters and/or digits) Y a
	 * 2-character year code (containing only digits) S a 5-character serial
	 * number (containing only digits).
	 * 
	 * Determining ISRCs of recordings On compact discs, ISRC codes can be
	 * stored in subchannel Q. Such codes can be read with applications like
	 * Ahead's Nero and Exact Audio Copy (EAC) and now also using libdiscid.
	 * Occasionally, ISRCs are printed on the cover or in the booklet of a
	 * release. Some collection societies such as SCPP and CISAC will also
	 * disclose ISRCs in their online catalogue although there is no legal or
	 * industry requirement to do so.
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
