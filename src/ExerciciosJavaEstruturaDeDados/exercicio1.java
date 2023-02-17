package ExerciciosJavaEstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

        Queue<String> nomeClientes = new LinkedList<>(); 
        
        Scanner leia = new Scanner(System.in); 
        
        int escolha = -1;
        while (escolha != 0) {
            
            System.out.println("\n1: Adicionar um cliente.");
            System.out.println("\n2: Listar todos os clientes.");
            System.out.println("\n3: Remover um cliente.");
            System.out.println("\n0: Sair.");
            System.out.println("\nEscolha uma opção:");
            
            escolha = leia.nextInt();
            leia.nextLine();
            
            switch (escolha) {
                case 1:
                    System.out.print("\nEntre com o nome do(a) cliente: ");
                    String nomeDoCliente = leia.nextLine();
                    nomeClientes.offer(nomeDoCliente); 
                    System.out.println("\nCliente " + nomeDoCliente + " adicionado(a) a lista.");
                    break;
                    
                case 2:
                    if (nomeClientes.isEmpty()) {
                        System.out.println("\nA lista está vazia.");
                    } else {
                        System.out.println("\nCliente adicionado(a) na lista:");
                        for (String cliente : nomeClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                    
                case 3:
                    if (nomeClientes.isEmpty()) {
                        System.out.println("\nA lista está vazia.");
                    } else {
                        String removerCliente = nomeClientes.poll();
                        System.out.println("\nCliente " + removerCliente + " removido(a) da lista.");
                    }
                    break;
                    
                case 0:
                    System.out.println("\nSaindo do programa.");
                    break;
                    
                default:
                    System.out.println("\nOpção invalida.");
            }
        }
    }
}
