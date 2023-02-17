package ExerciciosJavaLacosRepeticao2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int i, contPar = 0, contImpar = 0, num;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite um número inteiro: ");
			num = leia.nextInt();
			if (num%2==0) {
				contPar++;
			}
			else if (num%2!=0) {
				contImpar++;
			        
		}
	
		}
		System.out.println("Foram digitados " + contPar + " número par(es) e " + contImpar + " ímpar(es)");
	}
}