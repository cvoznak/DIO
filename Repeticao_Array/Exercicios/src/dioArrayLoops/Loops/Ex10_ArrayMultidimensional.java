package dioArrayLoops.Loops;
/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */

import java.util.Random;

public class Ex10_ArrayMultidimensional {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int [][]m = new int [4][4];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rd.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] mlinha : m) {
			for (int coluna : mlinha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}

	}

}
