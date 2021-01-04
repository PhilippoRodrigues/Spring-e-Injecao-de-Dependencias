package com.algaworks.algafood.injecao.modelo;

public class Cliente {

	public String nome;
	public String email;
	public String telefone;
	public boolean ativo = false;

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void ativar() {
		this.ativo = true;
		
	}
}
