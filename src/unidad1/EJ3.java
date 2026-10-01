package unidad1;

public class EJ3 {

	public static void main(String[] args) {
		int año = 2026;

        boolean bisiesto = (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;

        System.out.println(bisiesto);
	}

}
