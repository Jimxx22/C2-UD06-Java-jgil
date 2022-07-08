import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n;
		
		System.out.print("Introduce un numero para calcular el factorial de este: ");
		n=sc.nextInt();
		
		System.out.println("El factorial de "+n+" es: "+factorial(n));

	}
	
	//calculamos el factorial
	public static int factorial(int n) {
		
		int con=1;
		
		for(int i=1;i<=n;i++) {
			con*=i;
		}
		return con;
	}

}
