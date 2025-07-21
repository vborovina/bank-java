package com.bank.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;

public class ClienteDAOImpl implements ClienteDAO {

	List<Cliente> dataBase = new ArrayList<>();
	
	@Override
	public void create(Cliente cliente) {
		dataBase.add(cliente);
		
	}

	@Override
	public Cliente getCliente(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente, String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAll() {
		return this.dataBase;
	}

}
