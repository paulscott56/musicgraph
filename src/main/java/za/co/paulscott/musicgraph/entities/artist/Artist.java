package za.co.paulscott.musicgraph.entities.artist;

import java.util.Set;

import za.co.paulscott.musicgraph.entities.geo.Country;
import za.co.paulscott.musicgraph.enums.ArtistType;
import za.co.paulscott.musicgraph.enums.Gender;

/**
 * Artist schema
 * 
 *  Name
 *
 * The artist name 
 * is the official name of an artist, be it a person or a band. 
 * In most cases it's the name as found on the cd/record liner.
 * For people, the name can either be a legal name or a performance name. 
 * When both are in the database, they can be linked together using the performance name relationship.
 * 
 * Legal name
 * A legal name is the name of a person as used in official situations such as government dealings. 
 * This is usually the name which would be found on a birth certificate, although legal names can be changed, 
 * e.g. through marriage or by deed poll. Bands do not have legal names.
 * 
 * Performance name
 * A performance name is an alias used by a person for marketing or other reasons. 
 * A person may use several performance names and may also release material under their legal name.
 * 
 * Sort name
 * The sort name is a variant of the artist name which would be used when sorting artists by name, 
 * such as in record shops or libraries. 
 * Among other things, sort names help to ensure that all the artists that start with "The" don't end up up under "T".
 * 
 * Type
 * The type is used to explicitly state whether an artist is a person or group.
 * 
 * Gender
 * The gender is used to explicitly state whether a person identifies as male, female or neither. 
 * Groups do not have genders.
 * 
 * Country
 * The artist country, as the name suggests, stores the country with which an artist is primarily identified with. 
 * It does not necessarily have to be the birth country.
 * 
 * Begin and end dates
 * See the artist dates class for more information.
 * 
 * IPI code
 * An IPI (interested party information) code is an identifying number assigned by the CISAC database for musical rights management. 
 * See IPI for more information, including how to find these codes.
 * 
 * Alias
 * Aliases are alternate names for an artist, which currently have two main functions: 
 * localised names and search hints. 
 * Localised names are used to store the official names used in different languages and countries. 
 * These use the locale field to identify which language or country the name is for. 
 * Search hints are used to help both users and the server when searching and can be a number of things including alternate names, 
 * nicknames or even misspellings. 
 * 
 * MBID
 * Simple identifier UUID on MB db.
 * 
 * Disambiguation comment
 * See comments class for more information.
 * 
 * Annotation
 * See the annotations class for more information.
 *  
 * @author paul
 *
 */
public class Artist {
	
	private String                artistName;
	private String                legalName;
	private Set<String>           performanceName;
	private String                sortName;
	private ArtistType            type;
	private Gender                gender;
	private Country               country;
	private ArtistDate            beginDate;
	private ArtistDate            endDate;
	private IPICode               ipiCode;
	private Set<ArtistAlias>      alias;
	private String                mbId;
	private DisambiguationComment disAmbComment;
	private ArtistAnnotation      annotation;
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public Set<String> getPerformanceName() {
		return performanceName;
	}
	public void setPerformanceName(Set<String> performanceName) {
		this.performanceName = performanceName;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public ArtistType getType() {
		return type;
	}
	public void setType(ArtistType type) {
		this.type = type;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public ArtistDate getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(ArtistDate beginDate) {
		this.beginDate = beginDate;
	}
	public ArtistDate getEndDate() {
		return endDate;
	}
	public void setEndDate(ArtistDate endDate) {
		this.endDate = endDate;
	}
	public IPICode getIpiCode() {
		return ipiCode;
	}
	public void setIpiCode(IPICode ipiCode) {
		this.ipiCode = ipiCode;
	}
	public String getMbId() {
		return mbId;
	}
	public void setMbId(String mbId) {
		this.mbId = mbId;
	}
	public DisambiguationComment getDisAmbComment() {
		return disAmbComment;
	}
	public void setDisAmbComment(DisambiguationComment disAmbComment) {
		this.disAmbComment = disAmbComment;
	}
	public ArtistAnnotation getAnnotation() {
		return annotation;
	}
	public void setAnnotation(ArtistAnnotation annotation) {
		this.annotation = annotation;
	}
	public Set<ArtistAlias> getAlias() {
		return alias;
	}
	public void setAlias(Set<ArtistAlias> alias) {
		this.alias = alias;
	}
	
}
