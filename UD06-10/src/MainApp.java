import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		int[] array = rellenarArray();
		mostrarArray(array);

	}
	
	public static int[] rellenarArray() {
		
		Scanner sc = new Scanner(System.in);
		int tam;
		int n;

		System.out.println("Introduce el tamano de la Array: ");
		tam=sc.nextInt();
		
		int[] array = new int[tam];
		
		System.out.println("Vamos a rellenar la array.");
		
		for(int i=0;i<tam;i++) {
			System.out.print("Introduce un numero primo: ");
			//Si se introduce otra cosa que no sea un numero entero salta error.
			n=sc.nextInt();	
			//comprovamos que es primo
			if(primo(n)) {
		    	array[i]=n;
		    }else {
		    	System.out.println("ERROR: el numero introducido no es primo.");
		    	i--;
		    }
		}
		sc.close();
		System.out.println("La array ya esta llena.");
				
		return array;
	}
	
	public static void mostrarArray(int[] array) {
	
		int nMayor=0;
	
		//leemos toda la array, y guardamos en varibale el valor mas grande
		for(int i=0;i<array.length;i++) {
			if(nMayor<array[i]) {
				nMayor=array[i];
			}
		}
		System.out.println("El mayor numero de la array es "+nMayor);
	
	}
	
	//comprovamos que es primo
	public static boolean primo(int num) {
		int i=2;
		boolean a=true;
		//en este bucle bsucamos que no haya ningun divisible del numero en concreto
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
