package com.bank.model;

public class Funcionario extends PessoaAbs {

	private String matricula;
	private String cargo;
	
	public Funcionario(String cpf, String nome, String matricula, String cargo) {
		super(cpf, nome);
		this.matricula = matricula;
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
