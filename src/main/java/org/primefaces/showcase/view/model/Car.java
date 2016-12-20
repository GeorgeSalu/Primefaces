package org.primefaces.showcase.view.model;

public class Car {

	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private int valor;
	private boolean usado;

	public Car(String placa, String modelo, int i, String cor, int j, boolean usado) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = i;
		this.cor = cor;
		this.valor = j;
		this.usado = usado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

}
