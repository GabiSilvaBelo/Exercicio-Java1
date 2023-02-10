package ExerciciosJava4;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int numero,quantidade=0,media=0,pmedia1=0;
        
        do {
            System.out.println("Digite um número:");
            numero = leia.nextInt();
            
            if(numero%3==0 && numero!=0) {
                pmedia1+=numero;
                quantidade++;
            }
            
        }while(numero!=0);
        media = pmedia1/quantidade;
        
        System.out.println("A média de todos os números múltiplos de 3 é: "+media);

    }

}
