import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.print("Introduce un numero, este se transofrmara a binario:");
		n=sc.nextInt();
		
		System.out.println("El numero "+n+" ha binario es: "+binario(n));

	}
	
	public static String binario(int n) {
		String bin="";
		String bit;
		//int nbit;
		
		while(n!=1 && n!=0) {
			bit=String.valueOf(n%2);
			n/=2;
			
			bin=bit+bin;
		}
		return "1"+bin;
	}

}
