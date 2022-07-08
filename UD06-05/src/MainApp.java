import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.print("Introduce un numero, este se transofrmara a binario:");
		n=sc.nextInt();
		
		System.out.println("El numero "+n+" ha binario es: "+binario(n));

	}
	
	//lo passamos a binario
	public static String binario(int n) {
		String bin="";
		String bit;
		//int nbit;
		
		//mientras n no sea 1 o 0, seguimos dividiendo entre dos
		while(n!=1 && n!=0) {
			//sabemos si el bit del bianrio es 0 o 1
			bit=String.valueOf(n%2);
			n/=2;
			//unimos todos los bits 
			bin=bit+bin;
		}
		//anadimos el ultimo 1 que falta
		return "1"+bin;
	}

}
