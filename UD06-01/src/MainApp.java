import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int res;
		Double area=0.0;

		System.out.println("Selecciona la figura a la que quieres calcular el area: ");
		System.out.println("1-Circulo");
		System.out.println("2-Triangulo");
		System.out.println("3-Cuadrado");
		res=sc.nextInt();
		
		//seleccioanemos de que forma queremos calcular el area
		switch (res) {
		case 1:
			System.out.print("Para calcular el area de un Circulo necessitamos el radio. Introduce el radio: ");
			Double radi = sc.nextDouble();
			area=circulo(radi);
			break;
		case 2:
			System.out.print("Para calcular el area de un Triangulo necessitamos base y altura. Introduce el la base: ");
			Double base = sc.nextDouble();
			System.out.print("Ahora introduce la altura: ");
			Double altura = sc.nextDouble();
			area=triangulo(base,altura);
			break;
		case 3:
			System.out.print("Para calcular el area de un Cuadrado necessitamos el lado. Introduce el lado: ");
			Double lado = sc.nextDouble();
			area=cuadrado(lado);
			break;

		default:
			System.out.println("Esta opcion no existe.");
			break;
		}
		
		if(area > 0) {
			System.out.println("El area es: " + area);
		}

	}
	
	//calculamos area circulo
	public static double circulo( Double radi) {
		Double res= Math.PI*Math.pow(radi, 2);
		return res;
	}
	
	//caluclamos area triangulo
	public static double triangulo(Double base, Double altura) {
		Double res= (base*altura)/2;
		return res;
	}
	
	//caluclamos area cuadrado
	public static double cuadrado(Double lado) {
		Double res= lado*lado;
		return res;
	}

}
