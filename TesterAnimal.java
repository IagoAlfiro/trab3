package br.lasalle.opp.trab3;

public class TesterAnimal {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero();
		Reptil reptil = new Reptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Canguru canguru = new Canguru();
		
		imprimir(mamifero);
		imprimir(reptil);
		imprimir(peixe);
		imprimir(ave);
		imprimir(canguru);
		
		System.out.println("");
		System.out.println("================");
		System.out.println("video link: https://soapbox.wistia.com/videos/5Sq8rRybrP");
		System.out.println("================");
		
		
		
	}
	
	public static void imprimir(Mamifero mamifero) {
		
		System.out.println(mamifero.locomover());
		System.out.println(mamifero.alimentar());
		System.out.println(mamifero.emitirSom());
		System.out.println(mamifero.corPelo());
		System.out.println("");
		
	}
	
	public static void imprimir(Reptil reptil) {
		
		System.out.println(reptil.locomover());
		System.out.println(reptil.alimentar());
		System.out.println(reptil.emitirSom());
		System.out.println(reptil.corEscama());
		System.out.println("");
		
	}
	
	public static void imprimir(Peixe peixe) {
		
		System.out.println(peixe.locomover());
		System.out.println(peixe.alimentar());
		System.out.println(peixe.emitirSom());
		System.out.println(peixe.corEscama());
		System.out.println(peixe.soltarBolha());
		System.out.println("");
		
	}
	
	public static void imprimir(Ave ave) {
		
		System.out.println(ave.locomover());
		System.out.println(ave.alimentar());
		System.out.println(ave.emitirSom());
		System.out.println(ave.corPena());
		System.out.println(ave.fazerNinho());
		System.out.println("");
		
	}
	
/*public static void imprimir(Animal animal) {
		
		System.out.println(animal.locomover());
		System.out.println(animal.alimentar());
		System.out.println(animal.emitirSom());
		
		
	}*/
	
}
