package dioVariaveisDadosOperadores;

/* Classe de exemplo para o exercício da Aula 1 de vaiáveis, tipos de dado e operadores aritméticos*/

public class definicao_variaveis {

	public static void main(String[] args) {
		
		int i;
		//int i; Não podemos ter mais que uma varável definida com o mesmo nome
		int I; /* Como o JAVA é case sensitive podemos ter duas variáveis com o mesmo nome, porém uma maíuscula e outra minúscula*/
		//int 1a; variáveis não podem começar com números
		int _1a; /*Embora permitido devemos evitar pois não é uma boa prática*/
		int $aq; /*Embora permitido devemos evitar pois não é uma boa prática*/
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10; /* Uma vez definida uma variável como constante, significa que ela não varia*/
		//j = 15; Portanto, não podemos apresentar um novo valor para ela
		int asrn24678md;
		//int asrn246 78md; Não pode conter espaço no nome de uma variável
		int asrn2$4678_md = 10; /* A definição dessa variável é valida, porém não é uma boa prática, pois aplica $ e _*/
		//int asrn2$46%78_md = 10; O %, () são caractere invalido para o uso em uma variavel
		
		asrn24678md = 100;
		asrn2$4678_md = 10;
		
		int quantidadeProduto = 50; /* bom exemplo, e aplicação da notação camelo*/
		//int QuantidadeProduto; Não segue a boa regra de inicio em miniscula
		final int NUMERO_TENTATIVAS = 5; /* segue as boas regras, maiuscula e separada por _*/
		// final int numeroTentativas = 5; Não segue as boas regras
		int QUANTIDADE_OPCOES = 25; /* Não é final, mas está como maiusculo, não deveriamos fazer isso, mas não da um erro*/
		//int qtdPrd; falta expressividade
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);

	}

}
