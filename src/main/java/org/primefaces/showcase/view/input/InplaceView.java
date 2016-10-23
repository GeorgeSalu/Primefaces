package org.primefaces.showcase.view.input;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class InplaceView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -243777578091732829L;
	private String text = "Primefaces";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
