class Triangulo {
	
	private float base, altura;

	Triangulo() {
		base = 10;
		altura = 10;
	}

	Triangulo(float _base, float _altura) {
		this.base = _base;
		this.altura = _altura;
	}
	
	Triangulo(Triangulo triangulo) {
		//Cambiar forma
		altura = triangulo.base;
		base = triangulo.altura;
	}

	float obtenerArea() {
		return this.base * this.altura / 2;
	}

	void mostrar() {
		System.out.println("La base del triangulo es:" + this.base);
		System.out.println("La altura del triangulo es:" + this.altura);
	}
}