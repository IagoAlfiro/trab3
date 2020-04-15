package br.lasalle.opp.trab3;

public class Ave extends Animal {

	@Override
	public String locomover() {
		return "Voando";
	}

	@Override
	public String alimentar() {
		return "Sementes";
	}

	@Override
	public String emitirSom() {
		return "Som de Ave";
	}
	
	public String corPena() {
		return "Branco";
	}
	
	public String fazerNinho() {
		return "Feito";
	}

}
