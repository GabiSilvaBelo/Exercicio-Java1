package ExerciciosJavaIntroducaoLogica;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos;
		
        Scanner leia = new Scanner(System.in);
		
		System.out.println("\nQual o tempo de duração em segundos: ");
		segundos = leia.nextInt();

        horas = segundos/3600;
        minutos = (segundos %3600) /60;
        segundos = (segundos %3600) %60;
        
		System.out.println("\nO evento durou : "+horas+" hora(s), "+minutos+" minutos(os) e "+segundos+" segundo(os)");
	}
	
}