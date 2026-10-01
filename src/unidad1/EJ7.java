package unidad1;

public class EJ7 {

	public static void main(String[] args) {
		// double vi = 5;
		// double a = 2;
		double t;
		double d;
		
		String linea;
		linea = IO.readln("Tiempo: ");
				
		t = Double.parseDouble(linea);
		// d = (vi * t) + ((a * t * t) / 2);
		d = (5d * t) + ((2d * t * t) / 2);

		System.out.print("Distancia: ");
		System.out.print(d);
		System.out.print(" metros");

		
		
		//OTRA FORMA
		
		//double t;
		//double d;

		//t = Double.parseDouble(IO.readln("Tiempo: "));	
		// d = (5d * t) + ((2d * Math.pow(t, 2)) / 2d);

		//System.out.print("Distancia: ");
		//System.out.print(d);
		//System.out.print(" metros");
		
		
		
		//OTRA FORMA
		
		//double t = Double.parseDouble(IO.readln("Tiempo: "));
		//double d = (5d * t) + ((2d * Math.pow(t, 2)) / 2d);
		//System.out.println("Distancia: " + d + " metros");
	}

}
		
		