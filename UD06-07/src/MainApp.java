import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double eur;
		int res;
		
		System.out.print("Introduce una cantidad de euros: ");
		if(sc.hasNextDouble()) {
			eur=sc.nextDouble();
			
			System.out.println("Selecciona la moneda de cambio: ");
			System.out.println("1-Dolares");
			System.out.println("2-Yenes");
			System.out.println("3-Libras");
			if(sc.hasNextInt()) {
				res=sc.nextInt();
				sc.close();
			//decidimos si es Dolar, Yen o Libra
				switch (res) {
				case 1:
					conversor(eur,"D");
					break;
				case 2:
					conversor(eur,"Y");
					break;
				case 3:
					conversor(eur,"L");
					break;
					
				default:
					System.out.println("ERROR: Numero no correspondiente");
					break;
				}
			}else{
				System.out.println("ERROR: El valor introducido no es un numero.");
			}
		}else{
			System.out.println("ERROR: El valor introducido no es un numero.");
		}

	}
	
	public static void conversor(Double eur, String cambio) {
		
		//switch para saber que ha seleccioando el usuario
		switch (cambio) {
		case "L":
			System.out.println(eur+" Euros es igual a "+(eur*0.86)+" Libras");
			break;
		case "D":
			System.out.println(eur+" Euros es igual a "+(eur*1.28611)+" Dolares");
			break;
		case "Y":
			System.out.println(eur+" Euros es igual a "+(eur*129.852)+" Yenes");
			break;

		default:
			break;
		}
		
	}

}
