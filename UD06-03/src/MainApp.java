import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//pedimos un numero
		//hacemos bucle para comprovar si es primo, el bucle sera de 1 a este numero
		//en el bucle provamos el mod de todos los numeros entre 1 i este numero
		//si algun numero da 0 no es primo
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Vamos a comprovar si el numero que introduzcas es primo o no. Introduce un numero: ");
		int num=sc.nextInt();
		sc.close();
		if(primo(num)) {
			System.out.println("El numero "+num+" es primo");
		}else {
			System.out.println("El numero "+num+" no es primo");
		}

	}
	
	public static boolean primo(int num) {
		int i=2;
		boolean a=true;
		while (i<num && a==true) {
			if(num%i==0) {
				a=false;
			}
			i++;
		}
		
		if(num==1) {
			a=false;
		}
		return a;
	}

}
