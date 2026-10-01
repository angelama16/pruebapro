package unidad1;

public class EJ2 {

	public static void main(String[] args) {
		int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        boolean r1 = a < b || c != d;
        boolean r2 = c != d || a < b;
        
        System.out.println(r1);
        System.out.println(r2);
	}

}
