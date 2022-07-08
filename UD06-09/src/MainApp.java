import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
				
		int[] array = rellenarArray(0,9);
		mostrarArray(array);

	}
	
	public static int[] rellenarArray(int in, int fi) {
		
		Scanner sc = new Scanner(System.in);
		int tam;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		
		int[] array = new int[tam];
		
		for(int i=0;i<tam;i++) {
			Random random = new Random();
		    array[i]=random.nextInt(fi - in) + in;
		}
				
		return array;
	}

	public static void mostrarArray(int[] array) {
		
		int sum=0;
		
		System.out.println("\nVamos a mostrar la array.");
		
		for(int i=0;i<array.length;i++) {
			System.out.println("En la posicion "+i+" encontramos el valor: "+array[i]);
			sum+=array[i];
		}
		System.out.println("La suma de los valores de la array es: "+sum);
		
	}

}
