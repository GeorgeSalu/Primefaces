package org.primefaces.showcase.view.input;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView {

	private String[] selectedCities;
	private List<String> cities;

	@PostConstruct
	public void init() {
		cities = new ArrayList<>();
		cities.add("Miami");
		cities.add("London");
		cities.add("Paris");
		cities.add("Istanbul");
		cities.add("Berlin");
		cities.add("Barcelona");
		cities.add("Roma");
		cities.add("brasilian");
		cities.add("Amsterdam");
	}

	public String[] getSelectedCities() {
		return selectedCities;
	}

	public void setSelectedCities(String[] selectedCities) {
		this.selectedCities = selectedCities;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
