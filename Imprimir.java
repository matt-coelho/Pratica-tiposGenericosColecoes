package br.una.pratica08;

import br.una.pratica08.Exception.NullException;

public class Imprimir {
	protected void imprimir(Produto p){
		try{
			System.out.println("Codigo: "+p.getCodigo());
			System.out.println("Nome: "+p.getNome());
			System.out.println("Quantidade: "+p.getQuantidade());
			System.out.println("Tipo do produto: "+p.getTipo());
	
			if(p.getTipo()==TiposDeProduto.AcabadoParaVenda){
				System.out.println("Valor: R$ "+p.getValor());
				System.out.println("Codigo de Barras: "+p.getCodBarra());
			}
		}catch(NullException e){
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
}