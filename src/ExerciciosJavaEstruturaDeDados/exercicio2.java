package ExerciciosJavaEstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\nMenu:");
			System.out.println("\n1. Adicionar um novo livro na pilha.");
			System.out.println("\n2. Listar todos os livros da pilha.");
			System.out.println("\n3. Retirar um livro da pilha.");
			System.out.println("\n0. Finalizar programa.");

			System.out.print("\nEscolha uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("\nEntre com o nome do livro: ");
				String nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("\nLivro adicionado na pilha.");
				break;
			case 2:
				if (pilha.empty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					System.out.println("\nLivro(s) na pilha:");
					for (String livro : pilha) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if (pilha.empty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					String pegarLivro = pilha.pop();
					System.out.println("\nPegue o livro de pilha: " + pegarLivro);
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado.");
				break;
			default:
				System.out.println("\nOpção invalida.");
			}
		}

	}

}
