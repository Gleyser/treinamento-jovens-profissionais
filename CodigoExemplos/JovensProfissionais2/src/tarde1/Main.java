package tarde1;

public class Main {
	
	public static void main(String[] args) {
		
		// Inicializando os objetos 
		Motorista motorista = new Motorista("José", 30, "12345");
		// Parar de conhecer ops detalhes de carro
		Carro carro = new Carro("Maria", "modelo1", "preta", 2022);
		motorista.cadastrarCarroPrincipal(carro);
		
		System.out.println(motorista.toString());
		
		motorista.alteraStatus(TipoStatusEnum.TRISTE);
		
		System.out.println(motorista.toString());
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.out.println(motorista.getCarroPrincipal().toString());
		 * 
		 * // acelerar motorista.acelerar(20);
		 * 
		 * System.out.println(motorista.getCarroPrincipal().toString());
		 * 
		 * // frear motorista.frear(10);
		 * System.out.println(motorista.getCarroPrincipal().toString());
		 * 
		 * // acelerar motorista.acelerar(20);
		 * System.out.println(motorista.getCarroPrincipal().toString());
		 * 
		 * // ligar // desligar
		 * 
		 */
		
		
	}

}
