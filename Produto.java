package br.una.pratica08;

public class Produto {
	private String codigo;
	private String nome;
	private int quantidade;
	private TiposDeProduto tipo;
	private double valor;
	private long codBarra;
//-------------------------------------------------------------------------------------------------
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public long getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(long codBarra) {
		this.codBarra = codBarra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public TiposDeProduto getTipo() {
		return tipo;
	}
	public void setTipo(TiposDeProduto tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}