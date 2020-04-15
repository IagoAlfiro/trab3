package br.lasalle.opp.trab3;

public abstract class Animal {
	
	protected float peso;
	protected int idade;
	protected int membros;
	
	public abstract String locomover();
	public abstract String alimentar();
	public abstract String emitirSom();

}
