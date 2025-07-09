package com.bank.model;

public class Cliente extends PessoaAbs {

	private String tipoCliente;
	
	public Cliente(String cpf, String nome) {
		super(cpf, nome);
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente)  {
		if(tipoCliente.equals("NORMAL") || tipoCliente.equals("PREMIUM")) {
			this.tipoCliente = tipoCliente;
		}else {
			throw new RuntimeException("Tipo de cliente inválido!");
		}	
	}

	@Override
	public String toString() {
		return "Cliente [tipoCliente=" + tipoCliente + ", getCpf()=" + getCpf() + ", getNome()=" + getNome() + "]";
	}
	
}
