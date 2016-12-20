package org.primefaces.showcase.view.panel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;
import org.primefaces.showcase.view.model.Car;

@ManagedBean
public class TabbedView {

	private List<Car> cars;

	@PostConstruct
	public void init() {
		cars = new ArrayList<Car>();
		cars.add(new Car("dttddu", "fiat", 2017, "vermelho", 12, true));
		cars.add(new Car("dtsssss", "BMW", 2019, "verde", 12, false));
		cars.add(new Car("dtsssss", "Ford", 2012, "preto", 19, false));
		cars.add(new Car("dtsssss", "corsa", 2012, "preto", 12, false));
		cars.add(new Car("dtsssss", "volvo", 2012, "preto", 17, false));
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public void onTabChange(TabChangeEvent event){
		FacesMessage msg = new FacesMessage("Tab Change","Active Tab: "+event.getTab().getTitle());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void onTabClose(TabCloseEvent event) {
        FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
}
