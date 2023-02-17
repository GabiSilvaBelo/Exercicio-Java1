package ExerciciosJavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {
	
	    public static void main(String[] args) {
	    	
	        ArrayList<String> cor = new ArrayList<>(); 

	        Scanner leia = new Scanner(System.in); 

	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("\nEntre com a cor: #" + i + ": ");
	            String cores = leia.nextLine();
	            cor.add(cores);
	        }
	        
	        System.out.println("\nLista de cores:");
	        for (String cores : cor) {
	            System.out.println(cores);
	        }
	        
	        Collections.sort(cor);
	        System.out.println("\nLista de cores em ordem crescente:");
	        for (String cores : cor) {
	            System.out.println(cores);
	        }
	    }
	}