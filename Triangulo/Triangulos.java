import Lectura.Lectura;
import Lectura.LecturaTerminalImpl;

public class Triangulos {

	//Programa de sobre carga de métodos.
	static float altura;
	static float base;
    public static void main(String args[])
	{
		Lectura lectura = new LecturaTerminalImpl();
		Triangulo triangulo1 = new Triangulo();
		System.out.println("Area de triangulo 1 es: " + triangulo1.obtenerArea());
		System.out.println("Ingrese la base del triangulo 2");
		base = lectura.leerFloat();
		System.out.println("Ingrese la altura del triangulo 2");
		altura = lectura.leerFloat();
		Triangulo triangulo2 = new Triangulo(base, altura);
		System.out.println("Area de triangulo 2 es:"+ triangulo2.obtenerArea());
		Triangulo triangulo3 = new Triangulo(triangulo2);
		System.out.println("Datos del triangulo 3");
		triangulo3.mostrar();
	}
}
