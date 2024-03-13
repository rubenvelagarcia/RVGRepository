package tema3;
public class Ej4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anho, mes;
		anho=Ej3.solicitarNumero("Introduce el año: ");
		mes=Ej3.solicitarNumero("Introduce el mes: ");
		System.out.println("El mes "+mes+"/"+anho+" tiene "+diasDeUnMes(anho, mes)+" dias");	
	}
	
	public static int diasDeUnMes(int anho, int mes) {
		int numeroDias;
		switch (mes) {
		case 1,3,5,7,8,10,12:
			numeroDias=31;
			break;
		case 4,6,9,11:
			numeroDias=30;
			break;
		case 2:
			if(Ej3.esBisiesto(anho)==true) {
				numeroDias=29;
			}
			else {
				numeroDias=28;
			}
			break;

		default:
			System.out.println("error");
			numeroDias=-1;
			break;
		}
		
		return numeroDias;
	}


}
