public class Matriz {
    
	int[][] crearMatrizCargada() {
        int matriz[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = (int) (Math.random() * 9);
			}
		}
        return matriz;
	}

	int[][] productoMatrices(int[][] matriz1, int[][] matriz2) {
		int producto[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				int suma = 0;
				for (int j = 0; j < 3; j++) {
					suma += (matriz1[i][j] * matriz2[j][k]);
					producto[i][k] = suma;
				}
			}
		}
        return producto;
	}

    void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
            System.out.println("\n\r");
		}
    }

}
