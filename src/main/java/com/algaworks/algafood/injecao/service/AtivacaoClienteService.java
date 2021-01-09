 package com.algaworks.algafood.injecao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;
import com.algaworks.algafood.injecao.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
//	@Autowired	//Essa annotation é opcional
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
}
