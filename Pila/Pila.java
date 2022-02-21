class Pila {
	private int posicion;
	private int arreglo[];

	Pila() {
		arreglo = new int[5];
		posicion = -1;
	}

	public void ingresar(int dato) {
		if (posicion < 4) {
			posicion++;
			arreglo[posicion] = dato;
		} else
			System.out.println("PILA LLENA");
	}

	public void descargar() {
		if (posicion >= 0) {
			System.out.println("El dato linerado es: " + arreglo[posicion]);
			arreglo[posicion] = 0;
			posicion--;
		} else
			System.out.println("PILA VACIA");
	}

	public void mostar() {
		for (int i : arreglo) {
			System.out.print("" + i + " ");
		}
		System.out.println(" ");
	}

}