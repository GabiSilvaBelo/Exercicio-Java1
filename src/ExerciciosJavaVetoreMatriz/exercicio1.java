package ExerciciosJavaVetoreMatriz;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
	       int[] vetor = {5, 8, 3, 9, 1, 7, 2, 4, 6, 10}; 
	        
	        Scanner leia = new Scanner(System.in); 
	        
	        System.out.print("Entre com um número: ");
	        int procurarNumero = leia.nextInt(); 
	        
	        int indice = -1;
	        
	        
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == procurarNumero) {
	                indice = i; 
	                break; 
	            }
	        }
	        
	        if (indice == -1) {
	            System.out.println("\nNúmero não encontrado!"); 
	        } else {
	            System.out.println("\nO número está na posição " + indice);
	        }
	    }
	

	}
