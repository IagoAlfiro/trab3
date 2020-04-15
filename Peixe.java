package br.lasalle.opp.trab3;

public class Peixe extends Animal {

	@Override
	public String locomover() {
		return "Nadando";
	}

	@Override
	public String alimentar() {
		return "Algas";
	}

	@Override
	public String emitirSom() {
		return "Som de Peixe";
	}
	
	public String corEscama() {
		return "Cinza";
	}
	
	public String soltarBolha() {
		return "Soltando bolha";
	}

}
