package manha2_pre_abstrata;

public class Cachorro extends Animal {
	
	public Cachorro() {
		super.setPatas(4);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Cachorro faz auauau");
		
	}

	@Override
	public String toString() {
		return "Cachorro [] patas" + super.getPatas();
	}
	
	

}
