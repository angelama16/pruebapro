package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EJ10 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce tu nombre: ");
		double t0 = Double.valueOf(System.currentTimeMillis()).doubleValue();
		String nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		double t = (t1 - t0) / 1000d;
		System.out.printf("Hola %s, has tardado %.2f segundos en introducir tu nombre\n", nombre, t);

	}

}

//n salto de linea