package dioArrayLoops.Loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
 * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada do 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */
public class Ex05_Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Deseja ver a tabuada de qual número? ");
		n = sc.nextInt();
		
		for (i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		
		
		sc.close();
	}
}
