public class ManejoPilas {
    public static void main(String args[]) {
        int opc, dato;
        Pila pila = new Pila();
        do {
            System.out.println("1. Ingresar dato");
            System.out.println("2. remover dato");
            System.out.println("3. Salir");
            System.out.println("Digite la opción: ");
            opc = LEER.datoInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un número entero: ");
                    dato = LEER.datoInt();
                    pila.ingresar(dato);
                    pila.mostar();
                    break;
                case 2:
                    pila.descargar();
                    pila.mostar();
                    break;
                case 3:
                    pila.mostar();
                    System.out.println("FIN DE PROGRAMA");
                    break;
            }
        } while (opc != 3);
    }
}
