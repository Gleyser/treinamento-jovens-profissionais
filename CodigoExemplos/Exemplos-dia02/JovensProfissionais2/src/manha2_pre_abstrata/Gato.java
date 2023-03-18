package manha2_pre_abstrata;

public class Gato extends Animal {

	public Gato() {
		super.setPatas(4);
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato faz miau miau miau");

	}

	@Override
	public String toString() {
		return "Gato [] patas" + super.getPatas();
	}
	
	

}
