package manha2_strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Motorista motorista = new Motorista(TipoStatusMotoristaEnum.TRANQUILO);
		 * System.out.println(motorista.acelerar(10));
		 * 
		 * motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.NERVOSO);
		 * System.out.println(motorista.acelerar(10));
		 * 
		 * motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.TRISTE);
		 * System.out.println(motorista.acelerar(10));
		 * 
		 * motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.ESTRESSADO);
		 * System.out.println(motorista.acelerar(10));
		 * 
		 * System.out.println(motorista.podeDirigir());
		 * 
		 * motorista.setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum.TRISTE);
		 * System.out.println(motorista.podeDirigir());
		 */
		
		
		
		
		Motorista motorista = new Motorista("Jose", TipoStatusMotoristaEnum.TRANQUILO);
		Motorista motorista1 = new Motorista("Maria", TipoStatusMotoristaEnum.ESTRESSADO);
		Motorista motorista2 = new Motorista("Mendes", TipoStatusMotoristaEnum.TRISTE);
		Motorista motorista3 = new Motorista("Ana", TipoStatusMotoristaEnum.NERVOSO);
		
		List<Motorista> listaMotoristas = new ArrayList<Motorista>();
		
		listaMotoristas.add(motorista);
		listaMotoristas.add(motorista1);
		listaMotoristas.add(motorista2);
		listaMotoristas.add(motorista3);
		
		
		//List<Motorista> listaMotoristas2 = new ArrayList<Motorista>(Arrays.asList(motorista, motorista1, motorista2, motorista3));
		
		//System.out.println(listaMotoristas.toString());
		
		for (Motorista motoristaI : listaMotoristas) {
			
				
			
		}
		
		System.out.println(listaMotoristas.toString());
		
	}
	

}
