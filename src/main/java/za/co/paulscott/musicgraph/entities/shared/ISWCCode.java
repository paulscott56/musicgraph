package za.co.paulscott.musicgraph.entities.shared;

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
	private Set<String> composers;
	private String cisCode;
	private Set<String> derivativeWorks;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<String> getComposers() {
		return composers;
	}
	public void setComposers(Set<String> composers) {
		this.composers = composers;
	}
	public String getCisCode() {
		return cisCode;
	}
	public void setCisCode(String cisCode) {
		this.cisCode = cisCode;
	}
	public Set<String> getDerivativeWorks() {
		return derivativeWorks;
	}
	public void setDerivativeWorks(Set<String> derivativeWorks) {
		this.derivativeWorks = derivativeWorks;
	}
	
}
