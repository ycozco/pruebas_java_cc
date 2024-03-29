public class BusquedaBinaria {
    // Método para realizar la búsqueda binaria
    public static int binarySearch(int[] arr, int elemento) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int prueba = (fin - inicio) / 2;
            System.out.println(prueba);
            // Verificar si el elemento está presente en el medio
            if (arr[medio] == elemento) {
                return medio; // Elemento encontrado
            }

            // Si el elemento es mayor, ignorar la mitad izquierda
            if (arr[medio] < elemento) {
                inicio = medio + 1;
            } 
            // Si el elemento es menor, ignorar la mitad derecha
            else {
                fin = medio - 1;
            }
        }

        // Si llegamos aquí, significa que el elemento no está presente
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 44, 46, 50, 52, 55}; // Arreglo debe estar ordenado
        int elemento = 10;
        int resultado = binarySearch(arr, elemento);
        if (resultado == -1) {
            System.out.println("Elemento no presente en el arreglo");
        } else {
            System.out.println("Elemento encontrado en el índice " + resultado);
        }
    }
}