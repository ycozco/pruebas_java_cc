public static int kthSmallestElement(int[] arr, int k) {
    int n = arr.length;
    int low = 0, high = n - 1;
    
    while (low <= high) {
        // Partición del arreglo alrededor del último elemento
        int pivot = arr[high];
        int pivotLoc = low; // Localización inicial del pivote después de la partición
        
        for (int i = low; i <= high; i++) {
            // Si un elemento es menor o igual que el pivote, lo mueve al inicio
            if (arr[i] < pivot) {
                // Intercambio de arr[i] y arr[pivotLoc]
                int temp = arr[i];
                arr[i] = arr[pivotLoc];
                arr[pivotLoc] = temp;
                pivotLoc++;
            }
        }
        // Mover el pivote a su posición correcta
        int temp = arr[pivotLoc];
        arr[pivotLoc] = arr[high];
        arr[high] = temp;
        
        // Si la posición del pivote es igual a k, hemos encontrado el k-ésimo elemento más pequeño
        if (pivotLoc == k - 1) {
            return arr[pivotLoc];
        } else if (pivotLoc > k - 1) {
            // Si el pivote está a la derecha del k-ésimo elemento, busca en la mitad izquierda
            high = pivotLoc - 1;
        } else {
            // Si el pivote está a la izquierda del k-ésimo elemento, busca en la mitad derecha
            low = pivotLoc + 1;
        }
    }
    // Si k está fuera del rango del arreglo
    return -1; // O lanzar una excepción si es adecuado
}

public static void main(String[] args) {
    int[] arr = {7, 10, 4, 3, 20, 15};
    int k = 3;
    System.out.println("El " + k + "º elemento más pequeño es: " + kthSmallestElement(arr, k));
}
