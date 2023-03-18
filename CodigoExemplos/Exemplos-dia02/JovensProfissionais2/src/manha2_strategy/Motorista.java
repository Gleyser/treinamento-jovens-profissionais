package manha2_strategy;

import tarde1.Carro;
import tarde1.TipoStatusEnum;

public class Motorista {
	
	private String nome;
	
	private TipoStatusMotoristaEnum status;
		
	public Motorista(String nome, TipoStatusMotoristaEnum statusInicial) {		
		this.status = statusInicial;
		this.nome = nome;
	}
	
	public void setTipoStatusMotoristaEnum(TipoStatusMotoristaEnum novoStatus) {
		this.status = novoStatus;
	}
			
	public double acelerar(double velocidade) {
		// substituimos aquele monte de IF horrível por uma unicqa linha de codigo
		return this.status.velocidadeAtualizada(velocidade);
		
		
		// // Tranquilo(), Nervoso(velocidade * 1,2), Triste(velocidade * 0,8)
		
		
		/*if (this.status.equals(NERVOSO)) {
			this.carroPrincipal.acelerar(velocidade * 1.2);
		}
		
		else if (this.status.equals(TRISTE)) {
			this.carroPrincipal.acelerar(velocidade * 0.8);
		} 
		
		else if (this.status.equals(ESTRESADO)) {
			this.carroPrincipal.acelerar(velocidade * 1.6);
		} */
		
		
		/*
		 * else { this.carroPrincipal.acelerar(velocidade); }
		 */
		
	}
	
	public boolean podeDirigir() {
		return this.status.podeDirigir();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoStatusMotoristaEnum getStatus() {
		return status;
	}

	public void setStatus(TipoStatusMotoristaEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", status=" + status + "]";
	}

	
	

	
}
