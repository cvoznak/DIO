package dioArrayLoops.Loops;

import java.util.Scanner;

/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */
public class Ex07_OrdemInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] vetor = {0, -5, 15, 50, 5, 8};
		
		//System.out.println(vetor.length); (_____.length -> Mostra o tamanho do vetor)
		
		int count = 0;
		
		System.out.print("Vetor: ");
		
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		sc.close();
		System.out.println();
		System.out.print("Vetor na ordem inversa: ");
		
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

}
