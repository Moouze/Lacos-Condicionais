package LacosCondicionais;

import java.util.Scanner;

public class if3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		String nome;
		boolean apto;
		int idade;
		
		System.out.println("\nDigite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nPrimeira doação de sangue ?");
		apto = leia.nextBoolean();
		
		if(idade>=18 && idade<=69) {
		if(idade>=60 && idade<=69 && apto){
			System.out.println(nome+" Você não está apto para doar sangue!");
		}else{
			System.out.println(nome+" Você está apto para doar sangue!");
		}
			
		}
		
	}
	
	}
