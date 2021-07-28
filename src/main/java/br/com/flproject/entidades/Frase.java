package br.com.flproject.entidades;

public class Frase {

	private String tecla;
	private String frase;
	
	public Frase(String tecla, String frase) {
		super();
		this.tecla = tecla;
		this.frase = frase;
	}
	public String getTecla() {
		return tecla;
	}
	public void setTecla(String tecla) {
		this.tecla = tecla;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
}
