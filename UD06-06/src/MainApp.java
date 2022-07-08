import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un numero, vamos a contar las cifras de este: ");
		if(sc.hasNextInt()) {
			n=sc.nextInt();
		
			if(n>0) {
				System.out.println("El numero "+n+" tiene "+contarCifras(n)+" cifras.");
			}else {
				System.out.println("ERROR: El numero indicado es negativo");
			}
		}else {
			System.out.println("ERROr: el numero indicado no es entero");
		}
	}
	
	public static int contarCifras(int n) {		
		return String.valueOf(n).length();
	}

}
