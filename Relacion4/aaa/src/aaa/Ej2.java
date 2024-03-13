package aaa;

import java.util.Scanner;

public class Ej2 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		long valor;
		System.out.println("Introduce un número límite para calcular factoriales: ");
		numero = Integer.parseInt(teclado.nextLine());
		for (int i = 0; i != numero;i++) {
			valor=calculoFactorial(i);
			System.out.println(i+"! = "+valor);
			
		}
	}

	/**
	 * Este método obtiene un numero valida que es positivo y devuelve su factorial
	 * 
	 * @param Número que se desea transformar a factorial
	 * @return El factorial
	 */
	public static long calculoFactorial(long valor) {
		long factorial = 1;
		if (valor < 0) {
			System.out.println("error");
			factorial=-1;
		} else {
			for (int i = 1; i <= valor; i++) {
				factorial = factorial * i;
			}
			
		}
		return factorial;
	}
}
