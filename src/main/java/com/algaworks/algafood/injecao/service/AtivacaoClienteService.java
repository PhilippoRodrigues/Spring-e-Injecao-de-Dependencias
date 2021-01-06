package com.algaworks.algafood.injecao.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;
import com.algaworks.algafood.injecao.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("Notificador email: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
