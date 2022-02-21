class ProductoMatriz {
	static int[][] matriz1;
	static int[][] matriz2;
	static int[][] matrizProducto;

	public static void main(String[] args) {
		Matriz matriz = new Matriz();

		System.out.println("***** PRIMERA MATRIZ *****\n\r");
		matriz1 = matriz.crearMatrizCargada();
		matriz.mostrarMatriz(matriz1);

		System.out.println("***** SEGUNDA MATRIZ *****\n\r");
		matriz2 = matriz.crearMatrizCargada();
		matriz.mostrarMatriz(matriz2);

		System.out.println("***** PRODUCTO DE LAS DOS MATRICES ANTERIORES *****\n\r");
		matrizProducto = matriz.productoMatrices(matriz1, matriz2);
		matriz.mostrarMatriz(matrizProducto);
	}
}