package ExerciciosJava1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salariobruto= 2000;
		float adicionalnoturno= 500;
		float horasextras= 100;
		float descontos= 200;
		
		Scanner leia = new Scanner(System.in);
		
		float soma = ((salariobruto+adicionalnoturno+horasextras*5)-descontos);
		
		System.out.println("\nSeu salario liquido é de: "+soma);
	}

}