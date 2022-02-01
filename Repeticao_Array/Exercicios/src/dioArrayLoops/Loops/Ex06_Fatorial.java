package dioArrayLoops.Loops;

import java.util.Scanner;

/*
 * Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
 * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */
public class Ex06_Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, fatorial, resultado = 1;
		
		System.out.print("Digite o n�mero para o qual deseja saber o fatorial: ");
		fatorial = sc.nextInt();
		
		for (i = 1; i <= fatorial; i++) {
			resultado *= i;
		}
		
		/* Outra op��o para o for decrescente
		for (i = fatorial; i >= 1; i--) {
			resultado *= i;
		}
		*/
		
		System.out.println(fatorial + "! = " + resultado);
		
		sc.close();

	}

}
