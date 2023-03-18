package manha2_pre_heranca;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		// Na definiçao prefere-se colocar a super classe
		// Na inicializacao prefere-se colocar a sub classe correspondente
		// NAO EH VALIDO PARA QUANDO USAR HERANÇA PURA
		Pessoa funcionario2 = new Funcionario("Claudia", "123", 16, new BigDecimal(3000), "12345");

		Pessoa funcionario3 = new Pessoa("jose", "123", 23);

		Funcionario funcionario = new Funcionario("Ana", "123", 16, new BigDecimal(3000), "12345");
		// System.out.println(funcionario.toString());

		Pessoa pessoa = new Pessoa("Jose", "12345", 17);

		// Aceita o pai, mas também aceita o filho
		imprimeDeAcordoComAIdade(funcionario);
		imprimeDeAcordoComAIdade(pessoa);

		// Aceita o filho, mas não aceita o pai
		imprimeDeAcordoImposto(funcionario);
		imprimeDeAcordoImposto(pessoa);
		imprimeDeAcordoImposto(funcionario2);
		
		// Aceita o filho, mas não aceita o pai
		retornaNomeDoFuncionario(pessoa);

	}

	// Na assinatura dos metodos, prefere-se utilizar a classe pai como parametro
	// (funciona porque passamos a classe pai)
	public static void imprimeDeAcordoComAIdade(Pessoa pessoa) {
		// Polimorfismo na chamada ao método pessoa.ehMaiorDeIdade()
		if (pessoa.ehMaiorDeIdade()) {
			System.out.println(String.format("%s eh maior de idade", pessoa.getNome()));
		} else {
			System.out.println(String.format("%s nao eh maior de idade", pessoa.getNome()));
		}
	}

	// Na assinatura dos metodos, prefere-se utilizar a classe pai como parametro
	// (funciona porque passamos a classe pai)
	public static void imprimeDeAcordoImposto(Funcionario funcionario) {
		// Polimorfismo na chamada ao método pessoa.ehMaiorDeIdade()
		if (funcionario.declaraImpostoDeRenda()) {
			System.out.println(String.format("%s paga imposto", funcionario.getNome()));
		} else {
			System.out.println(String.format("%s nao paga imposto", funcionario.getNome()));
		}
	}

	public static String retornaNomeDoFuncionario(Funcionario funcionario) {
			return funcionario.getNome();
		}

}
