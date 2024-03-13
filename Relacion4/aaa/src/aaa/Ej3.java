package aaa;

import java.util.Scanner;

public class Ej3 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anho;
		boolean bisiesto;
		anho = solicitarNumero("Introduce el año: ");
		bisiesto = esBisiesto(anho);
		if (bisiesto == true) {
			System.out.println("Es un año bisiesto");
		} else {
			System.out.println("Es un año no bisiesto");
		}
	}

	/**
	 * Este metodo determina si un año es bisiesto
	 * 
	 * @param anho El año a comprobar
	 * @return Un parametro booleano con valor true si es bisiesto y false si no lo
	 *         es
	 */
	public static boolean esBisiesto(int anho) {
		boolean bisiesto;
		if (anho % 4 == 0) {
			if (anho % 100 == 0 && anho % 400 != 0) {
				bisiesto = false;
			} else {
				bisiesto = true;
			}
		} else {
			bisiesto = false;
		}

		return bisiesto;
	}

	public static int solicitarNumero(String msg) {
		int numero;
		System.out.print(msg);
		numero = Integer.parseInt(teclado.nextLine());
		return numero;
	}
}
