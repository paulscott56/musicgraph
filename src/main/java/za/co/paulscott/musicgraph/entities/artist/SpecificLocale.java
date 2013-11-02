package za.co.paulscott.musicgraph.entities.artist;

import org.springframework.data.neo4j.annotation.NodeEntity;

import za.co.paulscott.musicgraph.enums.Continent;
import za.co.paulscott.musicgraph.enums.LanguageCode;
import za.co.paulscott.musicgraph.enums.Locale;

@NodeEntity
public class SpecificLocale {

	private LanguageCode langCode;
	private Continent continent;
	private Locale locale;

	public LanguageCode getLangCode() {
		return langCode;
	}

	public void setLangCode(LanguageCode langCode) {
		this.langCode = langCode;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "SpecificLocale [langCode=" + langCode + ", continent="
				+ continent + ", locale=" + locale + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((continent == null) ? 0 : continent.hashCode());
		result = prime * result
				+ ((langCode == null) ? 0 : langCode.hashCode());
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpecificLocale other = (SpecificLocale) obj;
		if (continent != other.continent)
			return false;
		if (langCode != other.langCode)
			return false;
		if (locale != other.locale)
			return false;
		return true;
	}

}