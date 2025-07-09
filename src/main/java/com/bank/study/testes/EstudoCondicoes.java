package com.bank.study.testes;

public class EstudoCondicoes {

	public static void main(String[] args) {
		
		//if else
		
		String nome = "Antonio";
		int idade = 30;
		String sexo = "F";
		
		if((nome.equals("Antonio") && idade != 30) || sexo.equals("F")) {
			System.out.println("nome igual antonio");
		}else if(nome.equals("Victor") || idade == 30) {
			System.out.println("Entrou no segundo else if");
		}else if(nome.equals("Manuel") || idade == 30) {
			System.out.println("Entrou no terceiro else if");
		}else {
			System.out.println("entrou no else");
		}
		
		//switch case
		//TODO exemplo swith case
		//ternarios
		String texto = "";
		if(sexo.equals("F")) {
			texto = "Feminino";
		}else {
			texto = "masculino";
		}
		//System.out.println(texto);

		System.out.println(sexo.equals("F") ? "Feminino" : "Masculino");
		
	}

}
