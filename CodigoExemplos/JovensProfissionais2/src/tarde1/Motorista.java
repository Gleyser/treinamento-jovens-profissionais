package tarde1;

public class Motorista {
	
	private String nome;
	private int idade;
	private String CNH;
	private Carro carroPrincipal;
	
	// Tranquilo, Nervoso, Triste (solucao sem enum)
	//private String status;
	
	private TipoStatusEnum status;
	
	//private final String TRANQUILO = "TRANQUILO";
	//private final String NERVOSO = "NERVOSO";
	//private final String TRISTE = "TRISTE";
	//private final String ESTRESADO = "ESTRESADO";
	
		
	public Motorista(String nome, int idade, String CNH) {		
		this.nome = nome;
		this.idade = idade;
		this.CNH = CNH;
		this.status = TipoStatusEnum.TRANQUILO;
		
		// solucao sem enum
		//this.status = TRANQUILO;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCNH() {
		return CNH;
	}
	
	public void setCNH(String CNH) {
		this.CNH = CNH;
	}
	
	public void cadastrarCarroPrincipal(Carro carro) {
		this.carroPrincipal = carro;
	}
	
	public Carro getCarroPrincipal() {
		return carroPrincipal;
	}

	public void setCarroPrincipal(Carro carroPrincipal) {
		carroPrincipal = carroPrincipal;
	}
	
	public void alteraStatus(TipoStatusEnum statusNovo) {
		this.status = statusNovo;
	}
	
	/*
	 * public void alteraParaTranquilo() { this.status = TRANQUILO; }
	 * 
	 * public void alteraParaTriste() { this.status = TRISTE; }
	 * 
	 * public void alteraParaNervoso() { this.status = NERVOSO; }
	 * 
	 * public void alteraParaEstresado() { this.status = ESTRESADO; }
	 */
	
	public void acelerar(double velocidade) {
		// Alterar esse comportamento considerando o status do motorista	
		
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

	public void frear(double velocidade) {
		this.carroPrincipal.frear(velocidade);
		
	}

	@Override
	public String toString() {
		return "Motorista [nome=" + nome + ", idade=" + idade + ", CNH=" + CNH + ", carroPrincipal=" + carroPrincipal
				+ ", status=" + status + "]";
	}
	
	

}
