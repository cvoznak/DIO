package dioVariaveisDadosOperadores;

/* Classe de exemplo para o exerc�cio da Aula 1 de vai�veis, tipos de dado e operadores aritm�ticos*/

public class definicao_variaveis {

	public static void main(String[] args) {
		
		int i;
		//int i; N�o podemos ter mais que uma var�vel definida com o mesmo nome
		int I; /* Como o JAVA � case sensitive podemos ter duas vari�veis com o mesmo nome, por�m uma ma�uscula e outra min�scula*/
		//int 1a; vari�veis n�o podem come�ar com n�meros
		int _1a; /*Embora permitido devemos evitar pois n�o � uma boa pr�tica*/
		int $aq; /*Embora permitido devemos evitar pois n�o � uma boa pr�tica*/
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10; /* Uma vez definida uma vari�vel como constante, significa que ela n�o varia*/
		//j = 15; Portanto, n�o podemos apresentar um novo valor para ela
		int asrn24678md;
		//int asrn246 78md; N�o pode conter espa�o no nome de uma vari�vel
		int asrn2$4678_md = 10; /* A defini��o dessa vari�vel � valida, por�m n�o � uma boa pr�tica, pois aplica $ e _*/
		//int asrn2$46%78_md = 10; O %, () s�o caractere invalido para o uso em uma variavel
		
		asrn24678md = 100;
		asrn2$4678_md = 10;
		
		int quantidadeProduto = 50; /* bom exemplo, e aplica��o da nota��o camelo*/
		//int QuantidadeProduto; N�o segue a boa regra de inicio em miniscula
		final int NUMERO_TENTATIVAS = 5; /* segue as boas regras, maiuscula e separada por _*/
		// final int numeroTentativas = 5; N�o segue as boas regras
		int QUANTIDADE_OPCOES = 25; /* N�o � final, mas est� como maiusculo, n�o deveriamos fazer isso, mas n�o da um erro*/
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
