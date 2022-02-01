package dioArrayLoops.Loops;

import java.util.Locale;
import java.util.Scanner;

// Fa� um programa que pe� uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja invalido e continue pedindo at� que o usu�rio informe um valor v�lido.

public class Ex02_Nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota;
		
		System.out.print("Digite a nota: ");
		nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inv�lido!");
			System.out.print("Digite a nota: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Obrigado por digitar um valor v�lido!");
		
		sc.close();
	}

}
