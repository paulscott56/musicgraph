package za.co.paulscott.musicgraph.impl;

import org.springframework.beans.factory.annotation.Autowired;

import za.co.paulscott.musicgraph.entities.CountryEntity;
import za.co.paulscott.musicgraph.iface.Country;
import za.co.paulscott.musicgraph.services.CountryService;

public class CountryImpl implements Country {

	@Autowired
	private CountryService countryService;

	@Override
	public void saveCountry(CountryEntity country) {
		countryService.saveCountry(country);
		
	}

}
