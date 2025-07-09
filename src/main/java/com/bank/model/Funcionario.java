package com.bank.model;

public class Funcionario extends PessoaAbs {

	private String matricula;
	
	public Funcionario(String cpf, String nome, String matricula) {
		super(cpf, nome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Funcionario matricula=" + matricula + ", getCpf()=" + getCpf() + ", getNome()=" + getNome();
	}
	
	

	
}
