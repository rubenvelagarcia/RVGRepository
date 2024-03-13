package tema3;
import java.util.Scanner;

public class Ej1 {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limiteSuperior, limiteInferior;
		System.out.println("Introduce el limite superior: ");
		limiteSuperior=Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce el limite inferior: ");
		limiteInferior=Integer.parseInt(teclado.nextLine());
		System.out.println("El número introducido es "+ solicitarNumeroEnRango(limiteSuperior, limiteInferior));

	}
	/**
	 * Solicita un número y valida que este entre los limites que tenemos como parametros y volverá a pedir el dato en el caso que no este entre los limites.
	 * Si el limite inferior fuera mayor que limite superior se intercambiarian sus valores lo mismo para un limite superior menor.
	 * @param limiteSuperior
	 * @param limiteInferior
	 * @return El número solicitado
	 */
	public static int solicitarNumeroEnRango(int limiteSuperior,int limiteInferior) {
		int numero,reserva;
		if (limiteInferior>limiteSuperior) {
			reserva=limiteInferior;
			limiteInferior=limiteSuperior;
			limiteSuperior=reserva;
		}
		do {
			System.out.println("Introduce un número entre "+ limiteInferior+ " y "+limiteSuperior);
			numero=Integer.parseInt(teclado.nextLine());
		} while (numero>limiteSuperior || numero<limiteInferior);
		
		
		
		return numero;
	}

}
