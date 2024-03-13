package tema3;
import java.util.Scanner;

public class prueba {
	private static final double CONVERSOR_DOLAR_EURO = 1.094;
	private static Scanner teclado=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado, dolares;
		System.out.println("Empieza");
		mostrarMenu();
		System.out.println("Introduce la cantidad de dolares");
		dolares=Double.parseDouble(teclado.nextLine());
		resultado=convertirDolaresEuros(dolares);
		System.out.println("El resultado es "+resultado);
		

	}
	// Metodo mostrarMenu
	private static void mostrarMenu() {
		System.out.println("Menu de conversión:");
		System.out.println("1 Dolares a Euros");
		System.out.println("2 Euros a Dolares");
		System.out.println("3 Salir");
	}

	// Metodo DolaresAEuros
	private static double convertirDolaresEuros(double cantidadDolares) {
		double cantidadEuros;
		cantidadEuros = CONVERSOR_DOLAR_EURO * cantidadDolares;
		
		return cantidadEuros;
	}

}
