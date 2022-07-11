import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		rellenarArray();

	}
	
	public static void rellenarArray() {
		
		Scanner sc = new Scanner(System.in);
		int tam;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		sc.close();
		
		int[] array1 = new int[tam];
		//damos valores a array1
		array1=rellenarAleatorio(tam);
		int[] array2 = new int[tam];
		//copiamos el valor de array1 a aray 2
		System.arraycopy(array1, 0, array2, 0, tam);
		//damos nuevos valores en array2
		array2=rellenarAleatorio(tam);
				
		int[] array3 = unirArray(array1, array2);
		
		for(int i=0;i<array3.length;i++) {
			System.out.println(array1[i]+"*"+array2[i]+"="+array3[i]);
		}
		
	}
	//funcion para multiplicar las dos arrays
	public static int[] unirArray(int[] array1, int[] array2) {
		int[] arrayM = new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			arrayM[i]=array1[i]*array2[i];
		}
		
		return arrayM;		
	}
	
	// funcion para rellenar una aray con numeros aleatorios
	public static int[] rellenarAleatorio(int tam) {
		
		int[] array = new int[tam];
		
		for(int i=0;i<array.length;i++) {
			Random random = new Random();
			array[i]=random.nextInt(10 - 1) + 0;
		}
		
		return array;	
	}

}
