package ExerciciosJava5;

import java.util.Scanner;

public class exercicioextra3 {

	public static void main(String[] args) {

		int idade, idademenor = 0, idademaior = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();

		while (idade <=-99) {

			idademenor++;

		}
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		if (idade > 50) {
			idademaior++;

		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + idademenor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + idademaior);
	}
}
