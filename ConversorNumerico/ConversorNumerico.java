public class ConversorNumerico {
	public static void main(String[] args) {

		System.out.println("PROGRAMA DISEñADO PARA LA CONVERCION DE NUMEROS DECIMALES A OTROS SISTEMAS NUMERICOS");
		do {
			System.out.println("Digite la conversión que desea");
			System.out.println("1: Binario, 2: Octal, 3: Hexadecimal, 4: Salir");
			switch (LeerDatos.datoInt()) {
				case 1:
					System.out.println("Digite el numero");
					Conversor.ConvertirEnBin(LeerDatos.datoInt());
					break;
				case 2:
					System.out.println("Digite el numero");
					Conversor.ConvertirEnOctal(LeerDatos.datoInt());
					break;
				case 3:
					System.out.println("Digite el numero");
					Conversor.ConvertirEnHexadecimal(LeerDatos.datoInt());
					break;
				case 4:
					break;
				default:
					System.out.println("Operación no válida");
			}
		} while (true);
	}
}