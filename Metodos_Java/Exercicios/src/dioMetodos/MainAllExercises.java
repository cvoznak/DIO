package dioMetodos;

// Classe criada para execu��o dos m�todos criados para solu��o do exerc�cio da aula 1 - calculadora

public class MainAllExercises {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("Exerc�cio caculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		// Mensagem
		System.out.println("Exerc�cio mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		// Emprestimo
		
		System.out.println("Exerc�cio emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
	}

}
