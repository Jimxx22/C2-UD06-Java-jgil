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
		int n,nT;
		int j=0;
		boolean con=true, con2=false;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		
		int[] array = new int[tam];
		
		System.out.println("Introduce el numero que quieres que termine: (0-9)");
		nT=sc.nextInt();
		
		while(!con2) {
			if(nT<0 || nT>9) {
				System.out.println("ERROR: el numero entrado no esta en los parametros indicados (0-9). Introduce el numero de nuevo: ");
				nT=sc.nextInt();
			}else {
				con2=true;
			}
		}
		sc.close();
		
		for(int i=0;i<tam;i++) {
			Random random = new Random();
			n=random.nextInt(fi - in) + in;
			if(termina(n, nT)) {
				j++;
			}
			//nos aseguramos que havra un numero terminado en 5 en el array
			if(termina(n,nT) && con) {
				array[i]=n;
				con=false;
			}else if(!con) {
				array[i]=n;
			}else {
				i--;
			}
		}
		
		int[] array2 = new int[j];
		
		for(int i=0;i<tam;i++) {
			if(termina(array[i], nT)) {
				j=0;
				array2[j]=array[i];
				j++;
			}
		}
				
		return array2;
	}
	
	public static void mostrarArray(int[] array) {
	
		System.out.println("La array final contiene: ");
		//mostramos los numeros de la aray que terminan en 5
		for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
		}	
		
	}
	
	//comprovamos que terminan en 5
	public static boolean termina(int n, int nT) {
		//si dividimos entre 10 este numero, i el resto es 5, o el numero directamente ya es 5, sabemos que termina en 5
		if(n%10==nT || n==nT) {
			return true;
		}else {
			return false;
		}
	}

}
