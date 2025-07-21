package com.bank.study;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Forma[] formas = new Forma[3];
		formas[0] = new Quadrado(10);
		formas[1] = new Retangulo(5, 9);
		formas[2] = new TrianguloEquilatero(10, 8);

		for(Forma forma : formas) {
			System.out.println(forma.getNomeFormaGeometrica() + " Área: " + forma.calcularArea());
		}
	
	}

}
