package br.una.pratica08;

import java.util.LinkedList;

public class Colecao<E> {
	
	private static LinkedList <Produto> l = new LinkedList<>();
	
	public void adicionar(Produto pro){
		l.add(pro);
	}
	//
	public void remover(Produto pro){
		l.remove(pro);
	}
	//
	public int getNProdutosCadastrados(){
		return l.size();
	}
	//
	public void ImprimeTodosProdutosCadastrados(){
		Imprimir imp = new Imprimir();
		System.out.println("-----------------------TODOS OS PRODUTOS-----------------");
		for(int x = 0; x< l.size(); x++){
			System.out.println("\nProduto " + (x+1) +
			"\n---------------------------------------------------------");
			Produto pro = l.get(x);
			imp.imprimir(pro);
		}
		System.out.println("---------------------------------------------------------");
	}
	//
	public void ImprimeProduto(E cod){//codigo
		Produto pro = null;
		for(int x = 0; x < l.size(); x++){
			pro = l.get(x);
			if(pro.getCodigo().equals(cod)){
				break;
			}
		}
		Imprimir imp = new Imprimir();
		imp.imprimir(pro);
		System.out.println("---------------------------------------------------------");
	}
}