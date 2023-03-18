package manha2_pre_interface;

public interface Animal {
	
	// Todos os campos de uma interface sao public static e FINAL, por isso normalmente nas intefaces temos apenas assinatura dos metodos
	//public static final String nome = "gleyser";
	public static final int PATAS = 4;
	
	// Todas as classes que implementarem a interface Animal DEVEM obrigatoriamente implementar o método emitirSom()
	void emitirSom();
	
	// Todas as classes que implementarem a interface Animal DEVEM obrigatoriamente implementar o método emitirSom()
	int retornaIdade();
	
	String retorna();
	
}
