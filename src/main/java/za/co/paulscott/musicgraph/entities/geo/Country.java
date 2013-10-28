package za.co.paulscott.musicgraph.entities.geo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

import za.co.paulscott.musicgraph.enums.Locale;

/**
 * A country should be a node, with all places in that country as sub nodes.
 * Hopefully that will enable easy traversal from specific places to country and
 * vice versa
 * 
 * @author paul
 * 
 */

@Entity
@Table
public class Country {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "isocode")
	private Locale isoCode;
	
	@Column(name = "iso3code")
	private String iso3Code;
	
	@Column(name = "isonumericCode")
	private int isoNumericCode;
	
	@Column(name = "fips")
	private String fips;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "capital")
	private String capital;
	
	@Column(name = "area")
	private int area; // (in sq km)
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "continent")
	private String continent;
	
	@Column(name = "tld")
	private String tld;
	
	@Column(name = "currencyCode")
	private String currencyCode;
	
	@Column(name = "currencyName")
	private String currencyName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "postalcodeFormat")
	private String postalCodeFormat;
	
	@Column(name = "postalCodeRegex")
	private String postalCodeRegex;
	
	@Column(name = "languages")
	private String languages;
	
	@Column(name = "neighbours")
	private String neighbours;
	
	@Column(name = "equivalentFipsCode")
	private String equivalentFipsCode;

	public Locale getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(Locale isoCode) {
		this.isoCode = isoCode;
	}

	public String getIso3Code() {
		return iso3Code;
	}

	public void setIso3Code(String iso3Code) {
		this.iso3Code = iso3Code;
	}

	public int getIsoNumericCode() {
		return isoNumericCode;
	}

	public void setIsoNumericCode(int isoNumericCode) {
		this.isoNumericCode = isoNumericCode;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getTld() {
		return tld;
	}

	public void setTld(String tld) {
		this.tld = tld;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCodeFormat() {
		return postalCodeFormat;
	}

	public void setPostalCodeFormat(String postalCodeFormat) {
		this.postalCodeFormat = postalCodeFormat;
	}

	public String getPostalCodeRegex() {
		return postalCodeRegex;
	}

	public void setPostalCodeRegex(String postalCodeRegex) {
		this.postalCodeRegex = postalCodeRegex;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(String neighbours) {
		this.neighbours = neighbours;
	}

	public String getEquivalentFipsCode() {
		return equivalentFipsCode;
	}

	public void setEquivalentFipsCode(String equivalentFipsCode) {
		this.equivalentFipsCode = equivalentFipsCode;
	}
}
