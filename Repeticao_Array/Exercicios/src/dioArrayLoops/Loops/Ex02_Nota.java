package dioArrayLoops.Loops;

import java.util.Locale;
import java.util.Scanner;

// Faç um programa que peç uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja invalido e continue pedindo até que o usuário informe um valor válido.

public class Ex02_Nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite a nota: ");
		nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido!");
			System.out.print("Digite a nota: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Obrigado por digitar um valor válido!");
		
		sc.close();
	}

}
