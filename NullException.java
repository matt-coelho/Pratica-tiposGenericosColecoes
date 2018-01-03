package br.una.pratica08.Exception;

public class NullException extends NullPointerException {
	private static String msg = "Ponteiro nulo!\n Valor não encontrado.";
	
	public NullException(){
		super(msg);
	}
}
