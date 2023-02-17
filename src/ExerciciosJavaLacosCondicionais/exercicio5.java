package ExerciciosJavaLacosCondicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int cod,quantidade;
		float valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nGaby´s Lanches");
		System.out.println("\nCodigo 1 - Cachorro Quente - R$10,00");
		System.out.println("\nCodigo 2 - X-Salada - R$15,00");
		System.out.println("\nCodigo 3 - X-Bacon - R$18,00");
		System.out.println("\nCodigo 4 - Bauru - R$12,00");
		System.out.println("\nCodigo 5 - Refrigerante - R$8,00");
		System.out.println("\nCodigo 6 - Suco de laranja - R$13,00");
		System.out.println("\nDigite o código do produto:");
		cod = leia.nextInt();
		System.out.println("\nDigite a quantidade do produto:");
		quantidade = leia.nextInt();

        
    switch(cod) {
	
	case 1:
		valor = quantidade *10;
		System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+valor);
	break;
	case 2:
		valor = quantidade *15;
		System.out.println("\nProduto: X Salada - Valor a pagar: "+valor);
	break;
	case 3:
		valor = quantidade *18;
		System.out.println("\nProduto: X Bacon - Valor a pagar: "+valor);
	break;
	case 4:
		valor = quantidade *12;
		System.out.println("\nProduto: Bauru - Valor a pagar: "+valor);
	break;
	case 5:
		valor = quantidade *8;
		System.out.println("\nProduto: Refrigerante - Valor a pagar: "+valor);
	break;
	case 6:
		valor = quantidade *13;
		System.out.println("\nProduto: Suco de laranja - Valor a pagar: "+valor);
	break;
	default:
		System.out.println("\nOpção Inválida!!!");
	}
	

}

}