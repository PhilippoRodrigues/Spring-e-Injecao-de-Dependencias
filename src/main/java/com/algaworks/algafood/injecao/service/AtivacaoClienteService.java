 package com.algaworks.algafood.injecao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;
import com.algaworks.algafood.injecao.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false)
	private Notificador notificador;
	
//	@Autowired	//Essa annotation é opcional
//	public AtivacaoClienteService(Notificador notificador) {
//		this.notificador = notificador;
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null)
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		else
			System.out.println("Não existe notificador, mas cliente foi ativado");
		
//		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
}
