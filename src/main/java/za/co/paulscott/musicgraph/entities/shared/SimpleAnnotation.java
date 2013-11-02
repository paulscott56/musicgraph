package za.co.paulscott.musicgraph.entities.shared;

import org.springframework.data.neo4j.annotation.NodeEntity;

import za.co.paulscott.musicgraph.enums.AnnotationType;

/**
 * Annotations are text fields, functioning like a miniature wiki, that can be
 * added to any existing artists, labels, recordings, releases, release groups
 * and works.
 * 
 * Their purpose is to add information that usually doesn't fit into the data
 * schema, or because the information in itself has to be free-text.
 * 
 * The content of an annotation can be edited by any user. Like the rest of the
 * database, if something is incorrect or incomplete, you can fix it. All
 * changes are recorded and if someone deletes or defaces the annotation, you
 * can easily restore a previous copy.
 * 
 * Uses of annotations You mustn't add copyrighted content copied from other
 * resources, be they online or printed. More generally, you really shouldn't
 * copy/paste any kind of content, unless it's purely factual.
 * 
 * That being said, here are some things you can add to annotations: Additional
 * facts and trivia: place of recording of a track, city of birth of an artist,
 * awards won by a release, or any other data doesn't fit into the schema. This
 * is especially useful when the details given in a liner are more precise than
 * what is available: some tips for entering this data can be found in Sub
 * Optimal Credits. Miscellaneous editing warnings or information: for example
 * if the entity name presents some specific spelling and/or capitalization
 * difficulty, or why it shouldn't be merged into another. Open issues to
 * resolve: if you think something is wrong but you're not sure or don't want to
 * fix it yourself, you can write a short note to warn others about it. You may
 * use the word "FIXME" before your note. e.g. "FIXME: some of the releases in
 * this label page should probably be moved to label X". Additional
 * disambiguation: in the cases when two entities can't be fully distinguished
 * with a short comment, a longer explanation can be included in the annotation.
 * It's usually a good idea to add "See annotation" at the end of the
 * disambiguation comment in these cases.
 * 
 * Technical information
 * 
 * @author paul
 * 
 */
@NodeEntity
public class SimpleAnnotation {

	private String annotation;
	private AnnotationType type;

	public AnnotationType getType() {
		return type;
	}

	public void setType(AnnotationType type) {
		this.type = type;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

}
