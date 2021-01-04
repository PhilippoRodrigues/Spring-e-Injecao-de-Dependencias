package com.algaworks.algafood.injecao.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;
import com.algaworks.algafood.injecao.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
