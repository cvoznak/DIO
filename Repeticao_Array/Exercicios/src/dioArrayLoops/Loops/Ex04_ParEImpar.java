package dioArrayLoops.Loops;
/*
 * Fa�a um programa que pe�a n numeros inteiros, calcule e mostre a quantidade de 
 * n�meros pares e a quantidade de n�meros impares.
 */

import java.util.Scanner;

public class Ex04_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0, n, numero, countPar = 0;
		
		System.out.print("Quantos n�meros deseja digitar? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite o numero: ");
			numero = sc.nextInt();
			if (numero % 2 == 0 ) {
				countPar++;
			}
		}
		
		/* Outra op��o � utilizar do while:*/
		/*
		do {
			System.out.print("Digite o numero: ");
			numero = sc.nextInt();
			i++;
			if (numero % 2 == 0 ) {
				countPar++;
		}}while(i < n);*/
		
		System.out.println("Pares: " + countPar);
		System.out.println("Impares: " + (n - countPar));
		
		sc.close();

	}
	
}
