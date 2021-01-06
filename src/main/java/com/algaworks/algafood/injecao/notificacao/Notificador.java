package com.algaworks.algafood.injecao.notificacao;

import com.algaworks.algafood.injecao.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}