package dioMetodos;

// Classe dedicada a aplicação, chamado, dos metodos necessários para resolução do exercício de sobrecarga, aula2 e aula3.

public class MainQuadrilatero {
	
	public static void main(String[] args) {
		
		// Quadrilatero
		System.out.println("Exercício quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		
		// Quadrilatero retorno
		System.out.println("Exercício retorno");
		
		double areaQuadrado = QuadrilateroRetorno.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = QuadrilateroRetorno.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = QuadrilateroRetorno.area(7, 8, 9);
		System.out.println("Área do trapézio: "+ areaTrapezio);
		
		float areaLosangulo = QuadrilateroRetorno.area(5f, 5f);
		System.out.println("Área do Losangulo: " + areaLosangulo);
		
	}
}
