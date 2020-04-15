package br.lasalle.opp.trab3;

public class Canguru extends Mamifero {

	@Override
	public String locomover() {
		return "Pulando";
	}

	@Override
	public String alimentar() {
		return super.alimentar() + " e Folhas";
	}

	@Override
	public String emitirSom() {
		return "Som de Canguru";
	}
	
	

}
