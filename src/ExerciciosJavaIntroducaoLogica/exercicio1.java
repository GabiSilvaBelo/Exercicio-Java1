package ExerciciosJavaIntroducaoLogica;

import java.util.Scanner;

public class exercicio1 {

	private static Object soma;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos,meses,dias;
		
			
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSua idade em anos é: ");
		anos = leia.nextInt();
		System.out.println("\nSua idade em meses é: ");
		meses = leia.nextInt();
		System.out.println("\nSua idade em dias é: ");
		dias = leia.nextInt();
		
		
	   soma = (anos* 365) + (meses* 30) +dias;
		
		System.out.println("\nSeus dias de vida são: "+soma);

	}

}