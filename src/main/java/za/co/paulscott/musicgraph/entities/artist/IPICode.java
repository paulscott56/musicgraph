package za.co.paulscott.musicgraph.entities.artist;

/**
 * The Interested Parties Information Code (IPI) is an identifying number assigned in the 
 * CISAC database to each Interested Party in musical rights management.
 * 
 * In October 2001, the IPI database replaced the CAE database.
 * 
 * IPI numbers are attached to ISWC numbers, to allow CISAC to attach information such as 
 * author, composer, and arranger to ISWC registered works. 
 * IPI numbers can also be used at the websites of other work registration organizations, 
 * such as BMI to locate works in their databases.
 *  
 * @author paul
 *
 */
public class IPICode {

	private int IPICode;
	private ISWCCode iswcCode;
	
	public int getIPICode() {
		return IPICode;
	}
	public void setIPICode(int iPICode) {
		IPICode = iPICode;
	}
	public ISWCCode getIswcCode() {
		return iswcCode;
	}
	public void setIswcCode(ISWCCode iswcCode) {
		this.iswcCode = iswcCode;
	}
	
	
}
