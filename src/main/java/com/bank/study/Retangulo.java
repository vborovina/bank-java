package com.bank.study;

public class Retangulo implements Forma{

	private int lado;
	private int altura;
	
	public Retangulo(int lado, int altura) {
		this.altura = altura;
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.altura;
	}

	@Override
	public String getNomeFormaGeometrica() {
		return "Retangulo";
	}

}
