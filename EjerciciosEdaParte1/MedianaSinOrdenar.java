public class MedianaSinOrdenar {

    // Método principal para encontrar la mediana.
    public static double encontrarMediana(int[] arr) {
        int n = arr.length;
        // Si la longitud del arreglo es impar, encuentra directamente la mediana.
        if (n % 2 == 1) {
            return quickSelect(arr, 0, n - 1, n / 2);
        } else {
            // Para arreglos pares, encuentra los dos elementos centrales y calcula su promedio.
            // Utiliza quickSelect para encontrar el elemento justo antes de la mediana y el de la mediana,
            // y luego calcula el promedio de ambos.
            return 0.5 * (quickSelect(arr, 0, n - 1, n / 2 - 1) + quickSelect(arr, 0, n - 1, n / 2));
        }
    }

    // Método quickSelect para encontrar el k-ésimo elemento más pequeño en un rango dado del arreglo.
    private static int quickSelect(int[] arr, int low, int high, int k) {
        // Partición del arreglo basada en un pivote.
        int pivotIndex = partition(arr, low, high);

        // Si el pivote es igual a k, entonces hemos encontrado el valor de la mediana y lo retornamos.
        if (pivotIndex == k) {
            return arr[pivotIndex];
        // Si k es menor que el índice del pivote, entonces la mediana está en la mitad izquierda.
        } else if (pivotIndex > k) {
            return quickSelect(arr, low, pivotIndex - 1, k);
        // De lo contrario, está en la mitad derecha.
        } else {
            return quickSelect(arr, pivotIndex + 1, high, k);
        }
    }

    // Método de partición similar al de QuickSort. Selecciona un elemento como pivote y organiza
    // los elementos menores al pivote a su izquierda y los mayores a su derecha.
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote, intercambia los elementos en i y j.
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Coloca el pivote en la posición correcta.
        swap(arr, i, high);
        return i; // Retorna el índice del pivote después de la partición.
    }

<<<<<<< HEAD
    public static void main(String [] args) {
        int [] arreglo = {3,4,2,6,8,10,5,7,11,1};
        // arreglo ordenado 1,2,3,4,5,6,7,8,10,11
        System.out.println("La mediana es: "+ encontrarMediana(arreglo) );
        
=======
    // Intercambia dos elementos en el arreglo.
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
>>>>>>> ccaf76b3019715a623e0d5389abed20fc5d0c34f
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        System.out.println("La mediana es: " + encontrarMediana(arr));
        // Salida esperada: 3, ya que 3 es el tercer elemento en un arreglo ordenado [1,2,3,4,5]
        // Pero el arreglo original permanece mayormente desordenado.
    }
}
