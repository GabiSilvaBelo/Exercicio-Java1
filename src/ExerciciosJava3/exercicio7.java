package ExerciciosJava3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1,numero2,cod;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1º valor: ");
		numero1 = leia.nextInt();
		System.out.println("\nDigite o 2º valor: ");
		numero2 = leia.nextInt();
		
		System.out.println("\nCodigo 1 - Soma");
		System.out.println("\nCodigo 2 - Subtração");
		System.out.println("\nCodigo 3 - Multiplicação");
		System.out.println("\nCodigo 4 - Divisão");
		System.out.println("\nEscolha o codigo da operação: ");
	    cod = leia.nextInt();
	    
	    switch (cod) {
		
		case 1:
			cod= numero1+numero2;
			System.out.println("\nSua operação é: "+cod);
		break;
		case 2:
			cod = numero1-numero2;
			System.out.println("\nSua operação é: "+cod);
		break;
		case 3:
			cod = numero1*numero2;
			System.out.println("\nSua operação é: "+cod);
		break;
		case 4:
			cod = numero1/numero2;
			System.out.println("\nSua operação é: "+cod);
		break;
		default:
			System.out.println("\nOpção Inválida.");
		}
		

	}

} 
	

