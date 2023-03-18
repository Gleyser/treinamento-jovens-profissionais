package manha2_pre_abstrata;

public class Aranha extends Animal {
	
	public Aranha() {
		super.setPatas(8);
	}

	@Override
	public void emitirSom() {
		System.out.println("A aranha faz ...");
		
	}

	@Override
	public String toString() {
		return "Aranha [] patas" + super.getPatas();
	}
	
	


}
