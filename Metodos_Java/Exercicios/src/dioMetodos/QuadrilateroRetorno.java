package dioMetodos;

//Classe dedicada para cria��o dos metodos com uso de retorno a serem aplicados na solu��o do exerc�cio da aula 3 de m�todos.

public class QuadrilateroRetorno {
	
	public static double area(double lado) {
			
		return lado * lado;
		
	}
		
	public static double area(double lado1, double lado2) {
			
		return lado1 * lado2;
			
	}
		
	public static double area(double baseMaior, double baseMenor, double altura) {
			
		return ((baseMaior + baseMenor) * altura) / 2;
			
	}
		
	public static float area(float diagonal1, float diagonal2) {
			
		return (diagonal1 * diagonal2) / 2;
			
	}
}
