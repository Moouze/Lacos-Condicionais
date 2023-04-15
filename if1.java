package LacosCondicionais;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,resultado;
		
		
		System.out.println("Digite o numero A: ");
		n1 = leia.nextInt();
		System.out.println("Digite o numero B: ");
		n2 = leia.nextInt();
		System.out.println("Digite o numero C: ");
		n3 = leia.nextInt();

		resultado=(n1+n2);
		System.out.println("\nA + B " +resultado );
		
		if(resultado>n3) {
			System.out.println("\nA soma de A + B é maior do que C!!!");
		}
		else if(resultado<n3) {
			System.out.println("\nA soma de A + B é menor do que C!!!");
		
		}
		else if(resultado==n3) {
			System.out.println("\nA soma de A + b é igual a C!!!");
		}
		
		
	}

}
