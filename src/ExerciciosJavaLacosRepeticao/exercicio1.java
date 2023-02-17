package ExerciciosJavaLacosRepeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
		int num1,num2,x;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nDigite o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o 2º número: ");
		num2 = leia.nextInt();
		
		
		if(num1<num2) {
			
		}
	     else System.out.println("\nOpção Inválida: ");
		
		
		for (x=num1;x<=num2;x++) {
			
			if (x % 3 ==0 && x % 5==0) {
				System.out.println("\nNo intervalo de "+num1+" e "+num2+" :"+x+" é multiplo de 3 e 5");	
			}
					
	     
}
	
}	
	
}