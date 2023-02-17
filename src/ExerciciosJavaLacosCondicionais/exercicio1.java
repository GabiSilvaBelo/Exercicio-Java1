package ExerciciosJavaLacosCondicionais;

import java.util.Scanner;

public class exercicio1 {


	public static void main(String[] args) {
		
		int a,b,c,soma;
       
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nO valor de A é: ");
		a = leia.nextInt();
		System.out.println("\nO valor de B é: ");
		b = leia.nextInt();
		System.out.println("\nO valor de C é: ");
		c = leia.nextInt();

		soma = (a+b);
		System.out.println("\nSoma: "+soma);
		
		if (soma>c) {
			System.out.println("\nA soma de A + B é maior que C."); 
		}
		else if (soma<c) {
			System.out.println("\nA soma de A + B é menor que C.");
		}
		else if (soma==c) {
			System.out.println("\nA soma de A + B é igual a C.");
		}
	}
	

}