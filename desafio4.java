package aula2003;

import java.util.Scanner;
public class desafio4 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		double l1,l2,l3;
		
		System.out.print(" ");
		System.out.print("Informe a medida do lado 1: ");
		l1 = jc.nextDouble();
		System.out.print("Informe a medida do lado 2: ");
		l2 = jc.nextDouble();
		System.out.print("Informe a medida do lado 3: ");
		l3 = jc.nextDouble();
		
		if (l1 == l2 && l2 == l3) {
			System.out.print("Seu triângulo é um equilátero");
		}
		else if (l1 != l2 && l1 != l3) {
			System.out.print("Seu triângulo é um escalêno");
		}
		else {
			System.out.print("Seu triângulo é um isóceles");
		}
	}

}
