package com.bank.study.testeatributos;

import com.bank.study.atributos.Pessoa;

public class TesteAtributos {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.sobrenome = "Serra";
		pessoa.setNome("Antonio");
		
		//Scanner scan = new Scanner(System.in);
		System.out.println(pessoa.getNome());
		

	}

}
