package org.primefaces.showcase.view.input;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxView2 {

	private String[] selectedConsoles;

	public String[] getSelectedConsoles() {
		return selectedConsoles;
	}

	public void setSelectedConsoles(String[] selectedConsoles) {
		this.selectedConsoles = selectedConsoles;
	}

}
