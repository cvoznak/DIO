package dioMetodos;

// Classe dedicada a aplica��o, chamado, dos metodos necess�rios para resolu��o do exerc�cio de sobrecarga, aula2 e aula3.

public class MainQuadrilatero {
	
	public static void main(String[] args) {
		
		// Quadrilatero
		System.out.println("Exerc�cio quadril�tero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		
		// Quadrilatero retorno
		System.out.println("Exerc�cio retorno");
		
		double areaQuadrado = QuadrilateroRetorno.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		double areaRetangulo = QuadrilateroRetorno.area(5, 5);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);
		
		double areaTrapezio = QuadrilateroRetorno.area(7, 8, 9);
		System.out.println("�rea do trap�zio: "+ areaTrapezio);
		
		float areaLosangulo = QuadrilateroRetorno.area(5f, 5f);
		System.out.println("�rea do Losangulo: " + areaLosangulo);
		
	}
}
