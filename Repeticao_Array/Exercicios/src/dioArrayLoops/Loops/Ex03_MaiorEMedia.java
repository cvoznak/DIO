package dioArrayLoops.Loops;
/*
Fa�a um programa que leia 5 n�meros e informe o maior n�mero
e a m�dia desses n�meros.*/

import java.util.Scanner;

public class Ex03_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, count = 0, soma = 0, maior = 0;//� poss�vel inicializar as vari�veis durante sua cria��o
		
		double media;
			
		do {
			System.out.println("N�mero: ");
			numero = sc.nextInt();
			if (count == 0) {
				maior = numero;//com isso garantimos que seja poss�vel encontrar o maior mesmo que a sequencia completa seja de numeros negativos
			}
			if (maior < numero) {
				maior = numero;
			}
			soma += numero;
			count++;
		} while(count < 5);
		
		media = (double)soma / 5;
		
		System.out.println("Maior = " + maior);
		System.out.println("M�dia = " + media);
		
		sc.close();

	}

}
