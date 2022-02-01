package dioArrayLoops.Loops;
/*
 * Fa�a um programa que leia 20 numeros inteiros aleat�rios (entre 0 e 10) armazene-os num vetor.
 * Ao final mostre os n�meros e seus sucessores.
 */

import java.util.Random;

public class Ex09_NumerosAleatorios {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int [] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = rd.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("\nN�meros Aleat�rios: ");
		for (int num : numerosAleatorios) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nSucessores de n�meros Aleat�rios: ");
		for (int num : numerosAleatorios) {
			System.out.print((num + 1) + " ");
		}
	}

}
