package za.co.paulscott.musicgraph.entities;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * A country should be a node, with all places in that country as sub nodes.
 * Hopefully that will enable easy traversal from specific places to country and
 * vice versa
 * 
 * @author paul
 * 
 */
@NodeEntity
public class CountryEntity {

	@GraphId
	private Long id;

	//private Locale isoCode;

	private String iso3Code;

	private int isoNumericCode;

	private String fips;

	private String country;

	private String capital;

	private int area; // (in sq km)

	private int population;

	
	private String continent;

	private String tld;

	private String currencyCode;

	private String currencyName;

	private String phone;

	private String postalCodeFormat;

	private String postalCodeRegex;

	private String languages;

	private String neighbours;

	private String equivalentFipsCode;

//	public Locale getIsoCode() {
//		return isoCode;
//	}
//
//	public void setIsoCode(Locale isoCode) {
//		this.isoCode = isoCode;
//	}

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result
				+ ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((currencyCode == null) ? 0 : currencyCode.hashCode());
		result = prime * result
				+ ((currencyName == null) ? 0 : currencyName.hashCode());
		result = prime
				* result
				+ ((equivalentFipsCode == null) ? 0 : equivalentFipsCode
						.hashCode());
		result = prime * result + ((fips == null) ? 0 : fips.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((iso3Code == null) ? 0 : iso3Code.hashCode());
		result = prime * result + isoNumericCode;
		result = prime * result
				+ ((languages == null) ? 0 : languages.hashCode());
		result = prime * result
				+ ((neighbours == null) ? 0 : neighbours.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + population;
		result = prime
				* result
				+ ((postalCodeFormat == null) ? 0 : postalCodeFormat.hashCode());
		result = prime * result
				+ ((postalCodeRegex == null) ? 0 : postalCodeRegex.hashCode());
		result = prime * result + ((tld == null) ? 0 : tld.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryEntity other = (CountryEntity) obj;
		if (area != other.area)
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (currencyCode == null) {
			if (other.currencyCode != null)
				return false;
		} else if (!currencyCode.equals(other.currencyCode))
			return false;
		if (currencyName == null) {
			if (other.currencyName != null)
				return false;
		} else if (!currencyName.equals(other.currencyName))
			return false;
		if (equivalentFipsCode == null) {
			if (other.equivalentFipsCode != null)
				return false;
		} else if (!equivalentFipsCode.equals(other.equivalentFipsCode))
			return false;
		if (fips == null) {
			if (other.fips != null)
				return false;
		} else if (!fips.equals(other.fips))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (iso3Code == null) {
			if (other.iso3Code != null)
				return false;
		} else if (!iso3Code.equals(other.iso3Code))
			return false;
		if (isoNumericCode != other.isoNumericCode)
			return false;
		if (languages == null) {
			if (other.languages != null)
				return false;
		} else if (!languages.equals(other.languages))
			return false;
		if (neighbours == null) {
			if (other.neighbours != null)
				return false;
		} else if (!neighbours.equals(other.neighbours))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (population != other.population)
			return false;
		if (postalCodeFormat == null) {
			if (other.postalCodeFormat != null)
				return false;
		} else if (!postalCodeFormat.equals(other.postalCodeFormat))
			return false;
		if (postalCodeRegex == null) {
			if (other.postalCodeRegex != null)
				return false;
		} else if (!postalCodeRegex.equals(other.postalCodeRegex))
			return false;
		if (tld == null) {
			if (other.tld != null)
				return false;
		} else if (!tld.equals(other.tld))
			return false;
		return true;
	}

	
}
