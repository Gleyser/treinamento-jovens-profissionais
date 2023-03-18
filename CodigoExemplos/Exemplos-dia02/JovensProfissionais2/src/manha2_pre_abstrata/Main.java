package manha2_pre_abstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
				
		/*
		 * Animal animal = new Gato(); animal.emitirSom();
		 * animal.imprimeNumeroDePatas();
		 * 
		 * animal = new Cachorro(); animal.emitirSom(); animal.imprimeNumeroDePatas();
		 * 
		 * animal = new Aranha(); animal.emitirSom(); animal.imprimeNumeroDePatas();
		 */
		
		// criando uma coolecao de animais
		List<Animal> listaDeAnimais = new ArrayList<Animal>();
		//System.out.println(listaDeAnimais.size());
		
		Animal animal = new Gato();		
		Animal animal2 = new Aranha();
		Animal animal3 = new Cachorro();
		
		listaDeAnimais.add(animal);
	//	System.out.println(listaDeAnimais.size());
		
		listaDeAnimais.add(animal2);
		//System.out.println(listaDeAnimais.size());
		
		listaDeAnimais.add(animal3);
	//	System.out.println(listaDeAnimais.size());	
		
		for (Animal animalI : listaDeAnimais) {
			System.out.println(animalI.getPatas());
		}
		
		// Para acessar os objetos da colecao, pode-se iterar (for) ou via get(index)
		System.out.println(listaDeAnimais.get(0));
		System.out.println(listaDeAnimais.get(listaDeAnimais.size() - 1));
		
	}
	

}
