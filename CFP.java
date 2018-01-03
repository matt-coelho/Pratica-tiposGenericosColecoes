package br.una.pratica08.main;

import br.una.pratica08.Cadastro;
import br.una.pratica08.Colecao;
import br.una.pratica08.Imprimir;
import br.una.pratica08.Produto;
import br.una.pratica08.TiposDeProduto;

public class CFP {

	public static <E> void main(String[] args) {
		new Cadastro<Produto>("lapis", "L@712", 10,TiposDeProduto.MaterialDeEscritorio); //String nome, String codigo, int quantidade, TiposDeProduto tipo, double valor, long codBarra
		new Cadastro<Produto>("caneta", "C@31@", 15, TiposDeProduto.MaterialDeEscritorio); //String nome, String codigo, int quantidade, TiposDeProduto tipo, double valor, long codBarra
		new Cadastro<Produto>("cafe", "1010", 20, TiposDeProduto.ConsumoInterno); //String nome, String codigo, int quantidade, TiposDeProduto tipo, double valor, long codBarra
		new Cadastro<Produto>("plastico bolha", "plstb0lh@", 300, TiposDeProduto.AcabadoParaVenda, 2.40, 847382910); //String nome, String codigo, int quantidade, TiposDeProduto tipo, double valor, long codBarra
		
		Colecao col = new Colecao();
		
		col.ImprimeProduto("L@712");
		col.ImprimeProduto("C@31@");
		col.ImprimeProduto("1010");
		col.ImprimeProduto(847382910);
		col.ImprimeTodosProdutosCadastrados();
	}

}
