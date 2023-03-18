package manha2_pre_heranca;

import java.math.BigDecimal;

public class FuncionarioComHeranca extends Pessoa {
	
	private BigDecimal salario;
	private String matriculaFuncional;

	public FuncionarioComHeranca(String nome, String cpf, int idade, BigDecimal salario, String matriculaFuncional) {
		// chamando o construtor da super classe (Pessoa)
		// super classe tambem chamada de classe pai
		super(nome, cpf, idade);
		
		// Iniciando os atributos da sub classe (FuncionarioComHeranca)
		// sub classe tambem chamada de classe filho
		this.salario = salario;
		this.matriculaFuncional = matriculaFuncional;
	}
		
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getMatriculaFuncional() {
		return matriculaFuncional;
	}

	public void setMatriculaFuncional(String matriculaFuncional) {
		this.matriculaFuncional = matriculaFuncional;
	}	

	// >>>> Sobre o método CompareTo
	// Valor de retorno: este método pode retornar os seguintes valores:

	// 0 : se o valor deste BigDecimal (this.salario) for igual ao do objeto
	// BigDecimal passado como parâmetro (valorBase).
	
	// 1 : se o valor deste BigDecimal (this.salario for maior que o do objeto
	// BigDecimal passado como parâmetro (valorBase).
	
	// -1 : se o valor deste BigDecimal (this.salario) for menor que o do objeto
	// BigDecimal passado como parâmetro (valorBase).
	public boolean declaraImpostoDeRenda() {
		BigDecimal valorBase = new BigDecimal(2640);		
		int resultadoCompareTo = this.salario.compareTo(valorBase);
		
		if (resultadoCompareTo == -1) {
			return false;	
		}
		
		return true;
	}
	
	// exemplo que usa um atributo da super classe na sub classe
	public BigDecimal bonusDeAcordoComAIdade() {
		
		// se tiver mais de 50 anos, recebe 100 reais de bonus
		if (super.getIdade() > 50) {
			return new BigDecimal(100);
		}
		
		// se nao tiver mais de 50 anos, recebe 0 reais de bonus
		return new BigDecimal(0);
		
	}

	// SOBRESCRITA DE METODOS DA CLASSE PAI
	// Por nao ter sobrescrito o metodo toString, ao chamar o metodo na classe filha 
	// será chamado o da super clase (classe pai) -> Pessoa
	
	

}
