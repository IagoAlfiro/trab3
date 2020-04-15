package br.lasalle.opp.trab3;

public class Reptil extends Animal {

	@Override
	public String locomover() {
		return "Rastejando";
	}

	@Override
	public String alimentar() {
		return "Insetos";
	}

	@Override
	public String emitirSom() {
		return "Som de Reptil";
	}
	
	public String corEscama() {
		return "preto";
	}

}
