package manha1;

import java.util.Scanner;

public class Main {
	///// corpo da classe

	/// atributos
	/// metodos
	//// assinatura: nome (main) + atributos (opcional) (args)

	/// public, protected, private (visibilidade)

	/// Tipo de retorno: void (vazio) ou o tipo definido

	// Operadores:
	//// aritmetico:
	//// atribuicao:
	//// logico:
	////

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int quantidade = leitor.nextInt();

		lerNomesComWhile(quantidade);

		// String opcaoSelecionada = leitor.next();

		// menu(opcaoSelecionada);

		/*
		 * // Variavel valorQueAPessoaPossui = 100 // Ler o valor da Compra = teclado
		 * 
		 * double valorQueAPessoaPossui = 100.00;
		 * 
		 * // Criando o Scanner Scanner leitor = new Scanner(System.in);
		 * 
		 * // imprime(leitor.next());
		 * 
		 * // System.out.printf("Informe a quantidade de pessoas...: "); // int
		 * quantidadeDePessoas = leitor.nextInt();
		 * 
		 * System.out.printf("Informe o valor da compra...: "); double valor =
		 * leitor.nextDouble();
		 * 
		 * // condition - precisa ser uma expressao logica (resultado true ou falso)
		 * 
		 * 
		 * if (valor > valorQueAPessoaPossui) { System.out.println("Não pode comprar");
		 * System.out.println("Você continua com " + valorQueAPessoaPossui); }
		 * 
		 * else { System.out.println("Pode comprar"); System.out.println("Comprou");
		 * double restante = valorQueAPessoaPossui - valor; System.out.println("Sobrou "
		 * + restante); }
		 * 
		 * 
		 * 
		 * //System.out.printf("O Valor por pessoa eh: %.2f ", valorPorPessoa);
		 */
	}

	public static String retornaMeuNome() {

		// String nome (definição) Tipo nomeDaVariavel
		// = "Gleyser" (inicialização)

		// tipos primitivos: int, double, float, boolean

		String nomeDeRetorno = "Gleyser";

		return nomeDeRetorno;
	}

	public static void imprime(String conteudo) {
		System.out.println(conteudo);
	}

	public static void menu(String menuSelecionado) {

		switch (menuSelecionado) {
		case "CONTA":
			System.out.println("Acessando conta");
			break;

		case "SALDO":
			System.out.println("Acessando saldo");

			break;

		case "OUTRO":
			System.out.println("Acessando outro");

			break;

		default:
			System.out.println("Opcao invalida");
			break;
		}

		// Fazendo o mesmo com if else
		/*
		 * if (opcao.equals("A")) { /// faz X } else if (opcao.equals("B")) { /// faz Y
		 * } else { // faz Z }
		 */

	}

	// Estrutura de repetição: For e While

	public static void lerNomesComFor(int quantidade) {

		Scanner leitor = new Scanner(System.in);

		/// (inicializar variavel de controle, expressao condicional, alteracao da
		/// variavel de controle)
		// i++ = i + 1

		String nome;
		for (int i = 0; i < quantidade; i++) {
			nome = leitor.next();
			System.out.println("Nome lido: " + nome);
		}

		// primeira iteracao: i = 0

		// String nome = leitor.next();
		// System.out.println("Nome lido: " + nome);

		// nome = leitor.next();
		// System.out.println("Nome lido: " + nome);

		// nome = leitor.next();
		// System.out.println("Nome lido: " + nome);

	}

	public static void lerNomesComWhile(int quantidade) {

		Scanner leitor = new Scanner(System.in);
		String nome;
		
		int controle = 1;

		// controle = 0 e quantidade = 10 (ler o nome e imprime) -> controle = 1
		// controle = 1 e quantidade = 10 (ler o nome e imprime) -> controle = 2
		// controle = 2 e quantidade = 10 (ler o nome e imprime) -> controle = 3
		// ...
		// controle = 9 e quantidade = 10 (ler o nome e imprime) -> controle = 10

		while (quantidade > controle) {			
			nome = leitor.next();
			System.out.println("Nome lido: " + nome);
			controle++;
			
		}
	}
	
	public static int lerNumeros() {}
	
	public static boolean ehPar(int numero) {}

}
