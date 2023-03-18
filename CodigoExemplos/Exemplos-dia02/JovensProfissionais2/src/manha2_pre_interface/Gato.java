package manha2_pre_interface;

public class Gato implements Animal {
	private int idade;

	@Override
	public void emitirSom() {
		System.out.println("O gato faz miau miau miau");
		
	}

	@Override
	public int retornaIdade() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String retornaAlgumaCoisa() {
		return "gleyser";
	}

	@Override
	public String retorna() {
		// TODO Auto-generated method stub
		return null;
	}

}
