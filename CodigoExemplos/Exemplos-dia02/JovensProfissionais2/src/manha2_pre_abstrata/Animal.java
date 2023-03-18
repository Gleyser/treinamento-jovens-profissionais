package manha2_pre_abstrata;

public abstract class Animal {
	
	// pode ter atributos
	// A decisao entre private e protected depende da importancia em encapsular o atributo/informacao
	private int patas = 3;
	
	// pode ter metodos abstratos
	public abstract void emitirSom();
	
	// pode ter metodos com corpo
	public void imprimeNumeroDePatas() {
		System.out.println(this.patas);
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
