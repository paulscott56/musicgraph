package za.co.paulscott.musicgraph.enums;

/**
 * Status The status describes how "official" a release is. Possible values are:
 * official Any release officially sanctioned by the artist and/or their record
 * company. Most releases will fit into this category. promotional A give-away
 * release or a release intended to promote an upcoming official release (e.g.
 * pre-release versions, releases included with a magazine, versions supplied to
 * radio DJs for air-play). bootleg An unofficial/underground release that was
 * not sanctioned by the artist and/or the record company. This includes
 * unofficial live recordings and pirated releases. pseudo-release An alternate
 * version of a release where the titles have been changed. These don't
 * correspond to any real release and should be linked to the original release
 * using the transl(iter)ation relationship.
 */
public enum ReleaseStatus {
	OFFICIAL, PROMOTIONAL, BOOTLEG, PSEUDO_RELEASE,

}
