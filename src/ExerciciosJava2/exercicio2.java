package ExerciciosJava2;

import java.util.Scanner;

public class exercicio2 {

	private static Object soma;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias;
		int ano = 365;
		int mes = 30;
		int dia = 1;
		
			
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual a sua idade em dias: ");
		dias = leia.nextInt();
		
		
		soma = (dias/365);
		
		System.out.println("\nSeus anos de vida são: "+soma);

	}

}