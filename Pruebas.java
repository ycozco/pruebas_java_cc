import java.util.Random;

public class Pruebas {
    public static void mergesort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            mergesort(arr, inicio, medio);
            mergesort(arr, medio + 1, fin);
            fusionar(arr, inicio, medio, fin);
        }
    }
    
    public static void fusionar(int[] arr, int inicio, int medio, int fin) {
        // Encuentra el tamaño de los subarreglos para fusionarlos
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;
    
        // Crea arreglos temporales
        int izq[] = new int[n1];
        int der[] = new int[n2];
    
        // Copia los datos a los arreglos temporales
        for (int i = 0; i < n1; ++i)
            izq[i] = arr[inicio + i];
        for (int j = 0; j < n2; ++j)
            der[j] = arr[medio + 1 + j];
    
        // Fusiona los arreglos temporales
    
        // Índices iniciales del primer y segundo subarreglo
        int i = 0, j = 0;
    
        // Índice inicial del subarreglo fusionado
        int k = inicio;
        while (i < n1 && j < n2) {
            if (izq[i] <= der[j]) {
                arr[k] = izq[i];
                i++;
            } else {
                arr[k] = der[j];
                j++;
            }
            k++;
        }
    
        // Copia los elementos restantes de izq[] si hay alguno
        while (i < n1) {
            arr[k] = izq[i];
            i++;
            k++;
        }
    
        // Copia los elementos restantes de der[] si hay alguno
        while (j < n2) {
            arr[k] = der[j];
            j++;
            k++;
        }
    }
    public static void heapsort(int[] arr) {
        int n = arr.length;
    
        // Construir el montículo (reorganizar el arreglo)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
    
        // Extraer uno por uno los elementos del montículo
        for (int i=n-1; i>0; i--) {
            // Mover la raíz actual al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
    
            // llamar a la función heapify en el montículo reducido
            heapify(arr, i, 0);
        }
    }
    
    public static void heapify(int[] arr, int n, int i) {
        int max = i; // Inicializa max como raíz
        int left = 2*i + 1; // izquierda = 2*i + 1
        int right = 2*i + 2; // derecha = 2*i + 2
    
        // Si el hijo izquierdo es mayor que la raíz
        if (left < n && arr[left] > arr[max])
            max = left;
    
        // Si el hijo derecho es mayor que max hasta ahora
        if (right < n && arr[right] > arr[max])
            max = right;
    
        // Si max no es la raíz
        if (max != i) {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
    
            // Recursivamente heapify el subárbol afectado
            heapify(arr, n, max);
        }
    }
    public static int busquedaLineal(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
        int tamaño = 1000000;
        int[] arr = new int[tamaño];
        Random random = new Random();

        // Llenando el arreglo con valores aleatorios
        for (int i = 0; i < tamaño; i++) {
            arr[i] = random.nextInt(tamaño);
        }

        // Creando copias del arreglo para cada algoritmo
        int[] copiaParaMergesort = arr.clone();
        int[] copiaParaHeapsort = arr.clone();
        int[] copiaBusquedaLineal = arr.clone();

        // Medir y comparar Mergesort
        long inicio = System.currentTimeMillis();
        mergesort(copiaParaMergesort, 0, copiaParaMergesort.length - 1);
        long fin = System.currentTimeMillis();
        System.out.println("Mergesort: " + (fin - inicio) + " ns");

        // Medir y comparar Heapsort
        inicio = System.currentTimeMillis();
        heapsort(copiaParaHeapsort);
        fin = System.currentTimeMillis();
        System.out.println("Heapsort: " + (fin - inicio) + " ns");

        inicio = System.currentTimeMillis();
        busquedaLineal(copiaBusquedaLineal, 45);
        fin = System.currentTimeMillis();
        System.out.println("Busqueda Lineal: " + (fin - inicio) + " ns");
    }
}