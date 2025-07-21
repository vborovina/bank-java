package com.bank.study;

public class TrianguloEquilatero implements Forma {

	private double base;
	private double altura;
	
	public TrianguloEquilatero(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public String getNomeFormaGeometrica() {
		return "Triangulo";
	}
	
	
}
