import Lectura.*;

class Cuenta {

	private float saldo;
	private Lectura lecturaTerminal;

	Cuenta(){
		lecturaTerminal = new LecturaTerminalImpl();
	}

	public void consignar()
	{
		System.out.println("Digite valor a consignar");
		this.saldo += lecturaTerminal.leerFloat();
		System.out.println("Su nuevo saldo es: " + saldo);
	}

	public void retirar() {
		System.out.println("Digite valor a retirar");
		this.saldo -= lecturaTerminal.leerFloat();
		System.out.println("Su nuevo saldo es: " + saldo);
	}

	public void consultar() {
		System.out.println("El valor de su saldo es: " + saldo);
	}
}