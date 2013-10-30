package za.co.paulscott.musicgraph.enums;

/**
 * This field describes what it the main activity of a Label. The values may be:
 * one of the "production" subtypes, that applies to recording labels (in the
 * basic meaning of the term - an imprint): original production: should be used
 * for recording labels producing entirely new releases example: Riverside
 * Records bootleg production: should be used for known bootlegs companies (as
 * in "not sanctioned by the rights owner(s) of the released work") example:
 * Charly Records reissue production: should be used for labels specializing in
 * catalog reissues example: Rhino distributor: should be used for companies
 * mainly distributing other labels production, usually in a specific region of
 * the world example: ZYX, which distributes in Europe most jazz records in the
 * Concord Music Group catalog. holding: should be used for holdings,
 * conglomerates or other financial entities whose main activity is not to
 * produce records, but to manage a large set of recording labels owned by them
 * example: Concord Music Group rights society: A rights society is an
 * organization which collects royalties on behalf of the artists. This type is
 * designed to be used with the rights society relationship type rather than as
 * a normal release label. example: GEMA
 * 
 * @author paul
 * 
 */
public enum LabelStatus {
	ORIGINAL_PRODUCTION, BOOTLEG_PRODUCTION, REISSUE_PRODUCTION, DISTRIBUTOR, HOLDING, RIGHTS_SOCIETY
}
