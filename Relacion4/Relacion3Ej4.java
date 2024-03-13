package tema3;

import java.util.Scanner;

public class Relacion3Ej4 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apuesta, numeroCorrecto, intentos;
		apuesta = 999;
		numeroCorrecto = (int) Math.floor(Math.random() * 100 + 1);
		for (intentos = 5; intentos > 0 && apuesta != numeroCorrecto; intentos--) {
			System.out.println("Introduce un número");
			apuesta = Integer.parseInt(teclado.nextLine());
			if (apuesta < 1 || apuesta > 100) {
				System.out.println("Numero incorrecto debe estar entre 1 y 100");
			} else if (apuesta < numeroCorrecto) {
				System.out.println("El numero correcto es mayor que el introducido");
			} else if (apuesta > numeroCorrecto) {
				System.out.println("El numero correcto es menor que el introducido");
			}

		}
		if (numeroCorrecto != apuesta) {
			System.out.println("Has perdido intentelo de nuevo, el numero secreto era " + numeroCorrecto);
		} else {
			System.out.println("Enhorabuena has acertado, te han sobrado " + intentos + " intentos");
		}
	}

}