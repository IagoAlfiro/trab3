package br.lasalle.opp.trab3;

public class Mamifero extends Animal {

	@Override
	public String locomover() {
		return "Andando";
	}

	@Override
	public String alimentar() {
		return "Carne";
	}

	@Override
	public String emitirSom() {
		return "Som de Mamifero";
	}
	
	public String corPelo() {
		return "preto";
	}

}
