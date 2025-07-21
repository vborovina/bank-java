package com.bank.testes;

import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import com.bank.model.PessoaAbs;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;

public class Testes {

	public static void main(String[] args) {
		ClienteDAO dataBaseCli = new ClienteDAOImpl();
		
		Cliente cliente = new Cliente("123456", "Antonio Serra");
		Cliente cliente2 = new Cliente("987645", "Victor");
		
		dataBaseCli.create(cliente);
		dataBaseCli.create(cliente2);
		
		dataBaseCli.getAll().forEach(c ->{
			System.out.println(c.getNome());
		});

	}

}
