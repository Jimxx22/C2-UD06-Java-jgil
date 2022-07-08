import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		rellenarArray();

	}
	
	public static void rellenarArray() {
		
		Scanner sc = new Scanner(System.in);
		int tam;
		int n;
		boolean con=true;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		
		int[] array1 = new int[tam];
		array1=rellenarAleatorio(tam);
		int[] array2 = new int[tam];
		System.arraycopy(array1, 0, array2, 0, tam);
		array2=rellenarAleatorio(tam);
				
		int[] array3 = unirArray(array1, array2);
		
		for(int i=0;i<array3.length;i++) {
			System.out.println(array1[i]+"*"+array2[i]+"="+array3[i]);
		}
		
	}
	
	public static int[] unirArray(int[] array1, int[] array2) {
		int[] arrayM = new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			arrayM[i]=array1[i]*array2[i];
		}
		
		return arrayM;		
	}
	
	public static int[] rellenarAleatorio(int tam) {
		
		int[] array = new int[tam];
		
		for(int i=0;i<array.length;i++) {
			Random random = new Random();
			array[i]=random.nextInt(10 - 1) + 0;
		}
		
		return array;	
	}

}