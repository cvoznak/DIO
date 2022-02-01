package dioArrayLoops.Loops;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare inserindo o valor 0 no campo nome)

public class Ex01_NomeEIdade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.print("Nome:");
		nome = sc.next();
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		while (!(nome.equals("0"))) { //Com String não podemos trabalhar com os operadores == e !=, é necessário trabalhar com variavel.equal("conteudo") e nesse caso apliquei seu inverso
			System.out.print("Nome:");
			nome = sc.next();
			System.out.print("Idade: ");
			idade = sc.nextInt();
		}
		
		/* Outra opção seria trabalhar com o break como exemplificado abaixo
		
		int idade;
		String nome;
		
		while (!(nome.equals("0"))) { //Com String não podemos trabalhar com os operadores == e !=, é necessário trabalhar com variavel.equal("conteudo") e nesse caso apliquei seu inverso
			System.out.print("Nome:");
			nome = sc.next();
			if (nome.equals("0")) break;
			
			System.out.print("Idade: ");
			idade = sc.nextInt();*/
		
	
		
		sc.close();
	}

}
