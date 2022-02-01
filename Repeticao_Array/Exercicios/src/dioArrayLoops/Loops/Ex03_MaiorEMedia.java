package dioArrayLoops.Loops;
/*
Faça um programa que leia 5 números e informe o maior número
e a média desses números.*/

import java.util.Scanner;

public class Ex03_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, count = 0, soma = 0, maior = 0;//é possível inicializar as variáveis durante sua criação
		
		double media;
			
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			if (count == 0) {
				maior = numero;//com isso garantimos que seja possível encontrar o maior mesmo que a sequencia completa seja de numeros negativos
			}
			if (maior < numero) {
				maior = numero;
			}
			soma += numero;
			count++;
		} while(count < 5);
		
		media = (double)soma / 5;
		
		System.out.println("Maior = " + maior);
		System.out.println("Média = " + media);
		
		sc.close();

	}

}
