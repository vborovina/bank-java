package com.bank.repository;

import java.util.List;

import com.bank.model.Cliente;

public interface ClienteDAO {

	public void create(Cliente cliente);

	public Cliente getCliente(String cpf);
	
	public List<Cliente> getAll();

	public void delete(String cpf);

	public void update(Cliente cliente, String cpf);
}
