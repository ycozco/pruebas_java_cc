public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        /* Mueve los elementos de arr[0..i-1], que son
           mayores que key, a una posición adelante de su
           posición actual */
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}


public static void procesarElementos(int[] arreglo) {
    // Primera pasada: Suma 1 a cada elemento
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] += 1;
    }
    
    // Segunda pasada: Multiplica cada elemento por 2
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] *= 2;
    }
}