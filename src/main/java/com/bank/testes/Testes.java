package com.bank.testes;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.model.PessoaAbs;

public class Testes {

	public static void main(String[] args) {
		PessoaAbs funcionario = new Funcionario("123456", "Antonio Serra","77777");
		Cliente cliente = new Cliente("987654", "Victor");
		
		cliente.setTipoCliente("PREMIUM");
		
		System.out.println(funcionario.toString());
		System.out.println(cliente.toString());

	}

}
