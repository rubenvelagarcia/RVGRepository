package tema3;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horaActual, minutosActuales, segundosActuales, segundosASumar;
		do {
			horaActual=Ej3.solicitarNumero("Introduce la hora actual: ");
		} while (horaActual<0 || horaActual>24);
		do {
			minutosActuales=Ej3.solicitarNumero("Introduce los minutos actuales: ");
		} while (minutosActuales<0 || minutosActuales>60);
		do {
			segundosActuales=Ej3.solicitarNumero("Introduce los segundos actuales: ");
		} while (segundosActuales<0 || segundosActuales>60);
		do {
			segundosASumar=Ej3.solicitarNumero("Introduce los segundos a sumar: ");
		} while (segundosASumar<0);
		pintarNuevaHora(horaActual, minutosActuales, segundosActuales, segundosASumar);
		
	}
	public static void pintarNuevaHora(int horaActual, int minutosActuales, int segundosActuales, int segundosASumar) {
		int sumaSegundos;
		System.out.println("La hora anterior era H: "+horaActual+" M: "+minutosActuales+" S: "+segundosActuales);
		horaActual=horaActual*3600;
		minutosActuales=minutosActuales*60;
		sumaSegundos=horaActual+minutosActuales+segundosActuales+segundosASumar;
		horaActual=sumaSegundos%3600;
		sumaSegundos=sumaSegundos/3600;
		minutosActuales=sumaSegundos%60;
		sumaSegundos=sumaSegundos/60;
		System.out.println("La nueva hora es H: "+horaActual+" M: "+minutosActuales+" S: "+sumaSegundos);
	}
}
