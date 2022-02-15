import Lectura.*;

class Cajero {

	public static void main(String args[]) {
	 	Lectura lecturaTerminal = new LecturaTerminalImpl();
		int op;
		Cuenta cuenta = new Cuenta();
		do {
			System.out.println("Digite una opción");
			System.out.println("1: Consultar, 2: Consignar, 3: Retirar, 4: Salir");
			op = lecturaTerminal.leerInteger();
			switch (op) {
				case 1:
					cuenta.consultar();
					break;
				case 2:
					cuenta.consignar();
					break;
				case 3:
					cuenta.retirar();
					break;
			}
		} while (op != 4);
	}
}