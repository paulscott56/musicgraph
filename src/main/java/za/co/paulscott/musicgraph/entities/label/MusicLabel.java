package za.co.paulscott.musicgraph.entities.label;

import java.util.Date;
import java.util.Set;

import za.co.paulscott.musicgraph.entities.geo.Country;
import za.co.paulscott.musicgraph.entities.shared.DisambiguationComment;
import za.co.paulscott.musicgraph.entities.shared.SimpleAnnotation;
import za.co.paulscott.musicgraph.enums.LabelStatus;

/**
 * Labels are one of the most complicated and controversial parts of the music industry. 
 * The main reason for that being that the term itself is not clearly defined and refers to at 
 * least two overlapping concepts: 
 * imprints, and the companies that control them. 
 * Fortunately, in many cases the imprint and the company controlling it have the same name.
 * 
 * Imprint
 * Labels in MusicGraph refer mainly to imprints.
 * An imprint is (strictly, and nothing more than) a brand (and trademark) associated with the marketing 
 * of sound recordings (an imprint is not a company). 
 * An imprint may be marketed as a project, unit or division of the company that manages it. 
 * Imprints are the information you certainly want to add in the database and is the information 
 * available on sleeves in the form of a label logo (a.k.a. imprint). 
 * Imprints are labels, as one usually understand it. 
 * Specifically, you should favor using names as they are represented on the imprint, rather than using a company name 
 * (usually found in "copyright"/"produced" mentions).
 * 
 * Record company
 * To a lesser extent, a label entity may be created in the database to represent a record company.
 * A record company typically manages imprints, and coordinates the production / manufacturing / promotion / relations 
 * with artist / PR / distribution of sound recordings. 
 * Record companies may directly handle one or more of these aspects, or may sign contractual agreements with 
 * other companies to do the job. In some specific cases, you may want to create a label in the database to 
 * represent such a company name rather than an imprint: 
 * usually, such a move is required when labels went through complex merge/split operations and you need 
 * Advanced Relationships to structure the imprints list and represent their history in a meaningful way. 
 * Please note, though, that there is no need to "de-duplicate" companies from imprints when their name are very close.
 * 
 * Music group
 * Lastly, we also store music groups.
 * A music group is a financial holding company, whose purpose is solely to control and manage 
 * other companies directly involved in the production of sound recordings. 
 * For record companies, the use of Music groups is reserved for specific cases that you will likely not encounter 
 * unless you're doing some research intensive background work on structuring the labels list. 
 * 
 * @author paul
 *
 */
public class MusicLabel {
    /**
     * Name
     * The official name of the label.
     * The label name should be represented as found on media sleeves, 
     * including use of characters from non latin charsets, stylized characters, etc.
     * 
     * If a label is renamed a new label should be created and a label rename relationship created between the two.
     * If there exists multiple slightly different names for the label 
     * (eg: The Verve Music Group, Verve Music Group, VMG), 
     * you should use the most commonly used name, or the one used on the label's official site.
     * 
     * Labels are not always named uniquely, and different labels may share the same label name. 
     * To help differentiate between identically named labels, you should use a disambiguation comment and possibly an 
     * annotation as well.
     */
	private String name;
	
	/**
	 * Sort name
	 * A variant of the name. The guidelines for sort names can sometimes be tricky, see the style guidelines for reference.
	 */
	private String sortName;
	
	/**
	 * Label Code
	 * The label code is the "LC" code of the label.
	 * "The Label Code (LC) was introduced in 1977 by the IFPI (International Federation of Phonogram and Videogram Industries) 
	 * in order to unmistakably identify the different record labels 
	 * for rights purposes. 
	 * The Label Code consists historically of 4 figures, presently being extended to 5 figures, preceded by LC and a dash 
	 * (e.g. LC-0193 = Electrola; LC-0233 = His Master's Voice). 
	 * Note that the number of countries using the LC is limited, and that the code given on the item is not always accurate." 
	 * http://www.iasa-web.org/icat/08_0.htm
	 * A label code should not be confused with a release's catalog number. 
	 * A catalog number identifies a particular release, whereas a label code identifies an entire label. 
	 */
	private String labelCode;
	
	
	/**
	 * Type
	 * The type describes the main activity of the label.
	 */
	private Set<LabelStatus> type;
	
	
	/**
	 * Alias
	 * The aliases are used to store alternate names or mispellings.
	 */
	private Set<String> alias;
	
	/**
	 * Begin and end dates
	 * See the page about dates for more information.
	 */
	private Date beginDate;
	private Date endDate;
	
	/**
	 * Country
	 * The country of origin for the label.
	 */
	private Country country;
	
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

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public Set<LabelStatus> getType() {
		return type;
	}

	public void setType(Set<LabelStatus> type) {
		this.type = type;
	}

	public Set<String> getAlias() {
		return alias;
	}

	public void setAlias(Set<String> alias) {
		this.alias = alias;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
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