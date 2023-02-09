package ExerciciosJava1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1= 10.1;
		double nota2= 8.0;
		double nota3= 7.0;
		double nota4= 7.5;
		
		Scanner leia = new Scanner(System.in);
		
		double media = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("\nSua média foi de: "+media);

	}


}