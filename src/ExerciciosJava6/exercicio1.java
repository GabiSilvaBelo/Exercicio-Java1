package ExerciciosJava6;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		int vetorInteiros[] = { 2, 4, 10, 8, 3, 5, 9, 7, 1, 6 };
		int numero;
		int x;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();

		if (numero > 10) {
			System.out.println("\nNúmero não encontrado");
		}
        for (x=0;x<10;x++)
        	System.out.println("\nNúmero não encontrado");
	}
}
