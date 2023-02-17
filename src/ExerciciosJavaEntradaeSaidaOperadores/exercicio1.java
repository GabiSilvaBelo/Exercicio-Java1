package ExerciciosJavaEntradaeSaidaOperadores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario;
		float abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeu salario: ");
		salario = (float) leia.nextDouble();
		System.out.println("\nSeu abono: ");
		abono = (float) leia.nextDouble();
			
		float soma = (salario+abono);
		
		System.out.printf("\nSeu salário total é de: %.2f",soma);
		
	}

}