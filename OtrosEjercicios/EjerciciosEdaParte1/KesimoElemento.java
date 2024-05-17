package EjerciciosEdaParte1;

import java.util.Random;

public class KesimoElemento{
    public static int encontrarK (int [] arreglo, int k) {
        int tamano = arreglo.length;
        int min = 0, max = tamano-1;
        
        while(min<=max) {
            int pivot = arreglo[max];
            int locPivot = min;

            for(int i=min; i<=max; i++){
                if(arreglo[i]<pivot){
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[locPivot];
                    arreglo[locPivot] = temp;
                    locPivot++;                                                                    
                }
            }
            int temp = arreglo[locPivot];
            arreglo[locPivot] = arreglo[max];
            arreglo[max] = temp;

            if(locPivot==k-1) {
                return arreglo[locPivot];
            } else if (locPivot>k-1) {
                max=locPivot-1; 
            } else {
                min=locPivot+1;
            } 
        }
        return -1;
    }

    public static void main (String [] args) {
        int [] arreglo2 = {4,6,8,9,1,2};
        // 1,2,4,6,8,9
        // generar arreglo de 100 elementos aleatorio
        Random random = new Random();
        int[] arreglo = new int[100];
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            int elemento = random.nextInt(100);
            cadena += elemento + ", ";
            arreglo[i] = elemento;
            
        }
        
        int k = 15;
        System.out.println("Arreglo: " + cadena);
        System.out.println("k esimo elemento: " + encontrarK(arreglo, k)); 
    }

}