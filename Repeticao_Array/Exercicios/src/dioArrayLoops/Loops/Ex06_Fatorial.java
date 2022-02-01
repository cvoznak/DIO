package dioArrayLoops.Loops;

import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex06_Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, fatorial, resultado = 1;
		
		System.out.print("Digite o número para o qual deseja saber o fatorial: ");
		fatorial = sc.nextInt();
		
		for (i = 1; i <= fatorial; i++) {
			resultado *= i;
		}
		
		/* Outra opção para o for decrescente
		for (i = fatorial; i >= 1; i--) {
			resultado *= i;
		}
		*/
		
		System.out.println(fatorial + "! = " + resultado);
		
		sc.close();

	}

}
