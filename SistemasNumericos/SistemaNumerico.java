
class SistemaNumerico{

    private int vectorResultados[] = new int[100];
    int contador = 0;

    SistemaNumerico(){};

	void convertirNumero(int numero, int base, int _contador) {
		int i = _contador;
		do{
			if (numero >= base){
				vectorResultados[i] = numero % base;	
				numero = numero / base;
				if (numero <= base){
					vectorResultados[++i] = numero;
				} else {
					i++;
					convertirNumero(numero, base, i);
				}
			};
		}while( numero >= base );
        this.contador = ++i; //valor para crear vector auxiliar en invertirArreglo
	}

    private int[] invertirArreglo(){
		int[] vectorAuxiliar = new int[contador];
        int contadorAuxiliar = this.contador - 1;
        for(int i = 0; i < contador ; i++){
            vectorAuxiliar[i] = vectorResultados[contadorAuxiliar];
            contadorAuxiliar--;
        }
        return vectorAuxiliar;
	}

	public void mostrar(int base) {
		int[] vector = invertirArreglo();
		System.out.print("El número en base " + base + " es: ");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 10)
				System.out.print(vector[i]);
			else {
				if (vector[i] == 10)
					System.out.print("a");
				if (vector[i] == 11)
					System.out.print("b");
				if (vector[i] == 12)
					System.out.print("c");
				if (vector[i] == 13)
					System.out.print("d");
				if (vector[i] == 14)
					System.out.print("e");
				if (vector[i] == 15)
					System.out.print("f");
			}
		}
		System.out.println(" ");
	}
}
