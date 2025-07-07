package com.bank.study.testes;

import com.bank.study.atributos.Cliente;
import com.bank.study.atributos.Pessoa;

public class TesteAtributos {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.sobrenome = "Serra";
		pessoa.setNome("Antonio");
		
		//Scanner scan = new Scanner(System.in);
		System.out.println(pessoa.getNome());
		
		Cliente.descricaoCliente = "Descricao do cliente.......";
		
		Cliente cliente1 = new Cliente();
		cliente1.descricaoCliente = "teste1";
		
		Cliente cliente2 = new Cliente();
		cliente2.descricaoCliente = "teste2";
		
		System.out.println(cliente1.descricaoCliente);
		System.out.println(cliente1.idade);

	}

}
