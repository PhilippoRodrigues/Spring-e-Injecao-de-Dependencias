package com.algaworks.algafood.injecao.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.injecao.modelo.Cliente;

@Primary
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s, por meio do e-mail %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}
}
