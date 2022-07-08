import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		 int[] array = rellenarArray();
		 mostrarArray(array);
	}
	
	public static int[] rellenarArray() {
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a rellenar la array.");
		//vamos rellenando la array con los valores que escrivimos
		for(int i=0;i<10;i++) {
			System.out.print("Introduce un numero: ");
			//Si se introduce otra cosa que no sea un numero entero salta error.
			array[i]=sc.nextInt();	
		}
		System.out.println("La array ya esta llena.");
		
		return array;
	}
	
	//mostramos los valores de la array cons sus posiciones
	public static void mostrarArray(int[] array) {
		
		System.out.println("\nVamos a mostrar la array.");
		
		for(int i=0;i<array.length;i++) {
			System.out.println("En la posicion "+i+" encontramos el valor: "+array[i]);
		}
		
	}
}
