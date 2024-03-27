package aula2003;

import java.util.Scanner;
public class desafio3 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = jc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O seu número é par");
		}
			
		else {
			System.out.println("O seu número é impar");
		}

}
}
