package unidad1;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		double r, g, b, y, i, q;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce componentes RGB separadas por comas: ");
		r = in.nextDouble();
		g = in.nextDouble();
		b = in.nextDouble();
		
		y = 0.299 * r + 0.587 * g + 0.144 * b;
		i = 0.596 * r - 0.275 * g - 0.321 * b;
		q = 0.212 * r - 0.528 * g + 0.311 * b;

		System.out.println("Componente Y" + String.valueOf(y));
		System.out.println("Componente I" + i);
		System.out.println("Componente Q" + q);
		
		char c = "Hola mundo".charAt(0);
		String s = "Adios mundo";
		s = s + " cruel";
	}

}
