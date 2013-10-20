package za.co.paulscott.musicgraph.entities.artist;

import java.util.Set;

/**
 * The International Standard Musical Work Code (ISWC) 
 * 
 * is an ISO standard similar to ISBNs for identifying musical works / compositions.
 * According to the Wikipedia article about ISWC, to register an ISWC, the following minimal metadata must be supplied:
 * 
 * title 
 * names of all composers, arrangers and authors, with their role in the piece (identified by role code) and their CAE/IPI number
 * work classification code (CIS (?))
 * identification of other works it is a derivative of 
 * 
 * @author paul
 *
 */
public class ISWCCode {

	private String title;
	private Set composers;
	private String cisCode;
	private Set derivativeWorks;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set getComposers() {
		return composers;
	}
	public void setComposers(Set composers) {
		this.composers = composers;
	}
	public String getCisCode() {
		return cisCode;
	}
	public void setCisCode(String cisCode) {
		this.cisCode = cisCode;
	}
	public Set getDerivativeWorks() {
		return derivativeWorks;
	}
	public void setDerivativeWorks(Set derivativeWorks) {
		this.derivativeWorks = derivativeWorks;
	}
	
}
