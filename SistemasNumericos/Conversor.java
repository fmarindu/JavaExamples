import Lectura.*;

class Conversor {

	//Conversor numérico para bases del 2 al 16
	public static void main(String args[]) {
		SistemaNumerico sistemaNumerico = new SistemaNumerico();
		int base, numero, salir;
		Lectura lectura = new LecturaTerminalImpl();

		do {
			System.out.println("Digite la base del sistema numérico (2 a 16) deseado");
			base = lectura.leerInteger();
			System.out.println("Digite el número a convertir");
			numero = lectura.leerInteger();
			if (base > 16 ||base < 2 )
				System.out.println("La base no es permitida");
			else {
				sistemaNumerico.convertirNumero(numero, base, 0);
				sistemaNumerico.mostrar(base);
			}
			System.out.println("Digite 1 para finalizar el programa, otro numero para continuar");
			salir = lectura.leerInteger();
		} while (salir != 1);
	}
}
