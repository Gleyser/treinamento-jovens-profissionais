package manha2_pre_interface;

public class Main {
	
	public static void main(String[] args) {
				
		//Gato gato = new Gato();
		//gato.emitirSom();
		
		//Cachorro cachorro = new Cachorro();
		//cachorro.emitirSom();
					
		// Na definiçao prefere-se colocar a super classe
		// Na inicializacao prefere-se colocar a sub classe correspondente
		// NAO EH VALIDO PARA QUANDO USAR HERANÇA PURA
		Animal animal = new Gato();		
		animal.emitirSom();
		
		
		animal = new Cachorro();
		animal.emitirSom();		
		
		
		/*
		 * Animal animal;
		 * 
		 * animal = new Gato(); animal.emitirSom(); System.out.println(animal.PATAS);
		 * 
		 * animal = new Cachorro(); animal.emitirSom();
		 * System.out.println(animal.PATAS);
		 */
		
		// E se vier um animal com numero de patas diferente??? (herança ou classe abstrata)
	}
	
	public static void chamaOMetodoEmiteSom(Animal animal) {
		animal.emitirSom();
	}

}
