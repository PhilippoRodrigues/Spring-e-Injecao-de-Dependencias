package com.algaworks.algafood.injecao.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s, por SMS, pelo telefone %s: %s\n", cliente.getNome(),
				cliente.getTelefone(), mensagem);
	}
}
