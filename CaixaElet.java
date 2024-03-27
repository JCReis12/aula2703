package aula2003;

import java.util.Scanner;
public class CaixaElet {

	public static void main(String[] args) {
		
		Scanner jc = new Scanner (System.in);

		double saldo, saque; 
		int senhau, senhac,senhaf,op;
		long cpfu;
		long cpfc;
		
		cpfc = 123456789;
		senhac = 1234;
		saldo = 2500.00;
		
		System.out.print("Informe os primeiros 9 digitos de seu CPF: ");
		cpfu = jc.nextLong();
		
		System.out.print("Informe sua senha: ");
		senhau = jc.nextInt();
		
		if (cpfu == cpfc && senhau == senhac) {
			System.out.println(" ");
			System.out.println("Acesso permitido");
			System.out.println(" ");
			System.out.println("O que deseja fazer: ");
			System.out.println("01 - Sacar");
			System.out.println("02 - Depositar");
			System.out.println("03 - Emprestimo");
			System.out.println("04 - Sair");
			op = jc.nextInt();
			System.out.println(" ");
			
			if (op == 01){
				System.out.println("Opção de saque selecionado");
				System.out.println("Saldo: R$"+saldo);
				System.out.println(" ");
				System.out.print("Qual o valor que deseja sacar: R$");
				saque = jc.nextDouble();
				if (saque > saldo) {
					System.out.println("Saldo indisponível");
					while (saque > saldo) {
					System.out.println(" ");
					System.out.print("Qual o valor que deseja sacar: R$");
					saque = jc.nextDouble();
				}
			}
				System.out.println(" ");
				System.out.println("Confirmação");
				System.out.print("Digite sua senha: ");
				senhaf = jc.nextInt();
				
				if (senhaf == senhac) {
					System.out.println("Saque confirmado");
					System.out.println("Processando...");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Saque realizado");
					System.out.println("Aguarde o dinheiro sair do caixa pela entrada frontal");
					
					saldo = saldo-saque;
					
					System.out.println(" ");
					System.out.println("Saldo: R$"+ saldo);
				}
				else {
					System.out.println("Senha incorreta");
					while (senhaf != senhac) {
						System.out.println(" ");
						System.out.println("Confirmação");
						System.out.print("Digite sua senha: ");
						senhaf = jc.nextInt();
					}
					System.out.println("Saque confirmado");
					System.out.println("Processando...");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Saque realizado");
					System.out.println("Aguarde o dinheiro sair do caixa pela entrada frontal");
					
					saldo = saldo-saque;
					
					System.out.println(" ");
					System.out.println("Saldo: R$"+ saldo);
					
				}
				
				
				
				
			}
			
			
			
		
		}
		else if (cpfu != cpfc || senhau != senhac) {
			System.out.println(" ");
			System.out.println("Acesso negado");
		}
		
}
}
