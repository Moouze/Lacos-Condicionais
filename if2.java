package LacosCondicionais;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, poi;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		poi = (num%2);
		
		
		if (poi==0 && num<0) {
			System.out.println("\nO numero " +num+ " é par e Negativo ");
		}else if(poi==0 && num>0){
			System.out.println("\nO numero "+num+" é par e é Positivo");
		}else if(num>0){
			System.out.println("\nO numero "+num+" é impar e é Positivo");
		}else if(num<0){
			System.out.println("\nO numero "+num+" é impar e é negativo");
		}
		
	}

}
