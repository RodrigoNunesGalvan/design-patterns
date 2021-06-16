package br.com.designPatterns.loja.pedido.acoes;

import br.com.designPatterns.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido!");
    }
}
