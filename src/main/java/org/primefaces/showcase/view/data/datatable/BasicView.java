package org.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.showcase.view.model.Car;
import org.primefaces.showcase.view.service.CarService;

@ManagedBean(name = "dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7344296650526923461L;

	private List<Car> cars;

	@ManagedProperty("#{carService}")
	private CarService service;

	@PostConstruct
	public void init() {
		cars = service.createCars(10);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public CarService getService() {
		return service;
	}

	public void setService(CarService service) {
		this.service = service;
	}

	
	
}
