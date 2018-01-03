package br.una.pratica08;

public class Cadastro<E> {
	
	Produto pro = new Produto();
	Colecao<Produto> col = new Colecao<Produto>();
	
	public  Cadastro(String nome, String codigo, int quantidade, TiposDeProduto tipo, double valor, long codBarra){//produto acabado
		pro.setNome(nome);
		pro.setCodigo(codigo);
		pro.setCodBarra(codBarra);
		pro.setQuantidade(quantidade);
		pro.setTipo(TiposDeProduto.AcabadoParaVenda);
		pro.setValor(valor);
		
		col.adicionar(pro);
	}
	
	public Cadastro(String nome, String codigo, int quantidade, TiposDeProduto tipo){
		pro.setNome(nome);
		pro.setCodigo(codigo);
		pro.setQuantidade(quantidade);
		pro.setTipo(tipo);
		
		col.adicionar(pro);
	}
}