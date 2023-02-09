package ExerciciosJava3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int numero;
      
      Scanner leia = new Scanner(System.in);
      
      System.out.println("\nColoque um numero inteiro: ");
		numero = leia.nextInt();
		

		if(numero%2==0){
			if(numero>0)
			System.out.println("O número é par e positivo.\n");
		else {
			System.out.print("O número é par e negativo\n");
			}
	}else {
		if(numero>0) {
			System.out.print("O número impar e positivo\n");
		}else{
			System.out.print("O número impar e negativo\n");
		}
	}
	
  }

}