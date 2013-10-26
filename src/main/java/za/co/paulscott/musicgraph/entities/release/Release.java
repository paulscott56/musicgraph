package za.co.paulscott.musicgraph.entities.release;

import java.util.Date;
import java.util.Set;

import za.co.paulscott.musicgraph.entities.artist.Artist;
import za.co.paulscott.musicgraph.entities.geo.Country;
import za.co.paulscott.musicgraph.entities.label.MusicLabel;
import za.co.paulscott.musicgraph.entities.shared.DisambiguationComment;
import za.co.paulscott.musicgraph.entities.shared.SimpleAnnotation;
import za.co.paulscott.musicgraph.enums.LanguageCode;
import za.co.paulscott.musicgraph.enums.ReleasePackaging;
import za.co.paulscott.musicgraph.enums.ReleaseStatus;
import za.co.paulscott.musicgraph.enums.ScriptType;

/**
 * A MusicGraph release represents the unique release (i.e. issuing) of a product on a specific date 
 * with specific release information such as the country, label, barcode, packaging, etc. 
 * If you walk into a store and purchase an album or single, they're each represented in MusicGraph as one release.
 * 
 * Each release belongs to a release group and contains at least one medium 
 * (commonly referred to as a disc when talking about a CD release). Each medium has a tracklist.
 * 
 * A medium is the actual physical medium the audio content is stored upon. 
 * This means that each CD in a multi-disc release will be entered as separate mediums within the release, 
 * and that both sides of a vinyl record or cassette will exist on one medium. 
 * Mediums have a format (e.g. CD, DVD, vinyl, cassette) and can optionally also have a title.
 * 
 * Tracklists represent the set and ordering of tracks as listed on a liner, 
 * and the same tracklist can appear on more than one release. 
 * For example, a boxset compilation that contains previously released CDs would share the same 
 * tracklists as the separate releases.
 *  
 * @author paul
 *
 */
public class Release {
	
	/**
	 *  Title
	 *  The title of the release.
	 */
	private String title;
	
	/**
	 * Artist
	 * The artist(s) that the release is primarily credited to, as credited on the release.
	 */
	private Artist artist;
	
	/**
	 * Date
	 * The date the release was issued.
	 */
	private Date releaseDate;
	
	/**
	 * Country
	 * The country the release was issued in.
	 */
	private Country country;
	
	/**
	 * Label
	 * The label which issued the release. There may be more than one.
	 */
	private MusicLabel label;
	
	/**
	 * Catalogue number
	 * This is a number assigned to the release by the label which can often be found on the spine or near the barcode. 
	 * There may be more than one, especially when multiple labels are involved. 
	 * This is not the ASIN — there is a relationship for that — nor the label code.
	 */
	private Set<String> catalogueNumber;
	
	/**
	 * Barcode
	 * The barcode, if the release has one. The most common types found on releases are 12-digit UPCs and 13-digit EANs.
	 */
	private long barcode;
	
	/**
	 * Status
	 * The status describes how "official" a release is. Possible values are:
	 * official
	 * Any release officially sanctioned by the artist and/or their record company. Most releases will fit into this category.
	 * promotional
	 * A give-away release or a release intended to promote an upcoming official release 
	 * (e.g. pre-release versions, releases included with a magazine, versions supplied to radio DJs for air-play).
	 * bootleg
	 * An unofficial/underground release that was not sanctioned by the artist and/or the record company. 
	 * This includes unofficial live recordings and pirated releases.
	 * pseudo-release
	 * An alternate version of a release where the titles have been changed. 
	 * These don't correspond to any real release and should be linked to the original release using the 
	 * transl(iter)ation relationship.
	 */
	private ReleaseStatus status;
	
	/**
	 * Packaging
	 * The physical packaging that accompanies the release. See the list of packaging for more information.
	 */
	private ReleasePackaging packaging;
	
	/**
	 * Language
	 * The language a release's track list is written in. The possible values are taken from the ISO 639-3 standard.
	 */
	private LanguageCode language;
	
	/**
	 * Script
	 * The script used to write the release's track list. The possible values are taken from the ISO 15924 standard.
	 * See ScriptType
	 */
	private ScriptType scriptType;
	
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public MusicLabel getLabel() {
		return label;
	}

	public void setLabel(MusicLabel label) {
		this.label = label;
	}

	public Set<String> getCatalogueNumber() {
		return catalogueNumber;
	}

	public void setCatalogueNumber(Set<String> catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	public ReleaseStatus getStatus() {
		return status;
	}

	public void setStatus(ReleaseStatus status) {
		this.status = status;
	}

	public ReleasePackaging getPackaging() {
		return packaging;
	}

	public void setPackaging(ReleasePackaging packaging) {
		this.packaging = packaging;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public ScriptType getScriptType() {
		return scriptType;
	}

	public void setScriptType(ScriptType scriptType) {
		this.scriptType = scriptType;
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
