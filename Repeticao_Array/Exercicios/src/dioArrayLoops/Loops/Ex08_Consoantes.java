package dioArrayLoops.Loops;

import java.util.Scanner;

/*
 * Faça um Programa que leia um vetor de caracteres, 
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */
public class Ex08_Consoantes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] letras = new String [6];
		int qtdConsoantes = 0;
		
		int count = 0;
		
		do {
			System.out.print("Letra: ");
			letras[count] = sc.next();
				
			if (!(letras[count].equalsIgnoreCase("a") | 
					letras[count].equalsIgnoreCase("e") | 
					letras[count].equalsIgnoreCase("i") | 
					letras[count].equalsIgnoreCase("o") | 
					letras[count].equalsIgnoreCase("u"))) {
				qtdConsoantes++;
			}
			count++;
			
		} while (count < letras.length);
		
		System.out.println("Quantidade de consoante: " + qtdConsoantes);
		
		/*
		do {
			System.out.println("Letra: ");
			String letra = sc.next();
			
			if (!(letra.equalsIgnoreCase("a") | 
					letra.equalsIgnoreCase("e") | 
					letra.equalsIgnoreCase("i") | 
					letra.equalsIgnoreCase("o") | 
					letra.equalsIgnoreCase("u"))) {
				consoantes[count] = letra;
				qtdConsoantes++;
			}
			
		} while (count < consoantes.length);
		*/
		
		for (String letra : letras) {
			if (!(letra.equalsIgnoreCase("a") | 
					letra.equalsIgnoreCase("e") | 
					letra.equalsIgnoreCase("i") | 
					letra.equalsIgnoreCase("o") | 
					letra.equalsIgnoreCase("u"))) {
				System.out.print(letra + " ");
			}
		}
		sc.close();
		
	}

}
