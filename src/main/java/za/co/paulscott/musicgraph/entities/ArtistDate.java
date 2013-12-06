package za.co.paulscott.musicgraph.entities;

import java.util.Date;

import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * For artists The begin and end dates indicate when an artist started and
 * finished its existence. Its exact meaning depends on the type of artist:
 * 
 * For a person Begin date represents date of birth, and end date represents
 * date of death.
 * 
 * For a group Begin date represents the date when the group first formed: if a
 * group dissolved and then reunited, the date is still that of when they first
 * formed. End date represents the date when the group last dissolved: if a
 * group dissolved and then reunited, the date is that of when they last
 * dissolved (if they are together, it should be blank!). For listing other
 * inactivity periods, just use the Annotation and the "member of"
 * relationships.
 * 
 * For others There are no clear indications about how to use dates for artists
 * of the type Other at the moment.
 * 
 * For labels The exact meaning of the begin and end dates depends on the type
 * of label. Note that it's usually hard to know if an imprint has folded or is
 * just on hold, and in generally the end date should only be entered if there's
 * a clear indication of its demise.
 * 
 * Begin date
 * 
 * For officially registered trademarks or companies (holdings, distributors),
 * it's the date at which it was registered.
 * 
 * For imprints, collection names (when used as labels) and subdivisions (or
 * subsidiaries) for which there is no available creation date, it's the release
 * date of the first release ever issued under that label name.
 * 
 * For bootleg companies (more generally for obscure/dubious companies), it's
 * also tolerable to use the release date of the first release, unless more
 * accurate data is available.
 * 
 * End date For companies (holdings, distributors), it's the date at which the
 * company stopped to exist (be it bankrupted or dismantled).
 * 
 * For imprints, collection names (when used as labels) and subdivisions (or
 * subsidiaries) for which there is no available dismantling date, it's the
 * release date of the last release ever issued under that label name.
 * 
 * For bootlegs companies (or otherwise obscure/dubious companies), it's also
 * tolerable to use the release date of the last release, unless one has more
 * accurate information.
 * 
 * For areas The dates indicate when a certain area was founded and/or ceased to
 * exist. For example, the Soviet Union has a begin date of 1922 and an end date
 * of 1991.
 * 
 * For relationships The use of dates in relationships depends of the
 * relationship type, and sometimes they are not used at all. Check the page for
 * the specific relationship in the relationship types list to know more.
 * 
 * @author paul
 * 
 */
@NodeEntity
public class ArtistDate {

	private Date beginDate;
	private Date endDate;

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

}
