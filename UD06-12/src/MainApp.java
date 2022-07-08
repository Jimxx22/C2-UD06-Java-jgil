import java.util.Random;
import java.util.Scanner;

public class MainApp {

public static void main(String[] args) {
		
		int[] array = rellenarArray(1, 300);
		mostrarArray(array);

	}
	
	public static int[] rellenarArray(int in, int fi) {
		
		Scanner sc = new Scanner(System.in);
		int tam;
		int n;
		boolean con=true;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		
		int[] array = new int[tam];
		
		for(int i=0;i<tam;i++) {
			Random random = new Random();
			n=random.nextInt(fi - in) + in;
			if(termina5(n) && con) {
				array[i]=n;
				con=false;
			}else if(!con) {
				array[i]=n;
			}else {
				i--;
			}
		}
				
		return array;
	}
	
	public static void mostrarArray(int[] array) {
	
		for(int i=0;i<array.length;i++) {
			if(termina5(array[i])) {
				System.out.print(array[i]+" ");
			}
		}	
		
	}
	
	public static boolean termina5(int n) {
		if(n%10==5 || n==5) {
			return true;
		}else {
			return false;
		}
	}

}