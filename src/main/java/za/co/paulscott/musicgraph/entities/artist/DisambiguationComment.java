package za.co.paulscott.musicgraph.entities.artist;

/**
 * The disambiguation comments are fields in the database used to help distinguish identically named artists, 
 * labels and other entities. 
 * They are visible in the pages for the entities, and also appear in the search results next to their names.
 * 
 * Disambiguation comments should be kept fairly short. 
 * A few words are usually enough for someone reading it to recognize the entity they're looking for. 
 * The comment fields should not be used to store general background information: 
 * that kind of information should go in the annotation instead. 
 * The text inside the comment field is not part of the title, and thus should be entered following the normal capitalization rules 
 * (that is, usually in lowercase).
 * 
 * You will be prompted to enter a disambiguation comment any time you try to add a new artist or label that 
 * shares its name with an existing one, but you'll not be prompted to enter a disambiguation comment for the "old" one, 
 * nor for works, recordings, releases and release groups. 
 * To enhance the search results, you should ideally provide a disambiguation comment for all the identically named entities, 
 * by navigating to their pages and editing them.
 * 
 * Examples
 *  Randy Jackson has the disambiguation comment "brother of Michael and Janet."
 *  Randy Jackson has the disambiguation comment "former bassist with Journey and American Idol Judge"
 *  The album Weezer has the disambiguation comment "Red Album"
 *  The album Weezer has the disambiguation comment "Green Album"
 *   
 * @author paul
 *
 */
public class DisambiguationComment {

	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
