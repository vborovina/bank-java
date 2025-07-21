package com.bank.model;

public class Agencia {

    private String numero;
    private String endereco;
    private String cpfGerente;

    public String getNumero(){
        return this.numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpfGerente() {
        return cpfGerente;
    }

    public void setCpfGerente(String cpfGerente) {
        this.cpfGerente = cpfGerente;
    }
}
