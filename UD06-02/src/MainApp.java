import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// ens demana quants numeros aleatoirs surten
		// indiquem el rang don auquests numeros han de ser
		// imprimim el numero de numeros que em indicat dins del rang establert.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica la cantidad de numeros aleatorios que saldran: ");
		int n = sc.nextInt();
		
		System.out.print("Ahora indicaremos el rango de estos numeros aleatorios. Indica el inicio: ");
		int ini=sc.nextInt();
		System.out.print("Ahora el final: ");
		int fin=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			System.out.print(aleatorio(ini, fin)+" ");
		}
	}
	
	public static int aleatorio(int ini, int fin) {
		Random random = new Random();
	    return random.nextInt(fin - ini) + ini;
	}

}
