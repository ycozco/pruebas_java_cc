package EjerciciosEdaParte1;

public class MedianaSinOrdenar {

    public static double encontrarMediana(int [] arreglo){
        int tamano = arreglo.length;
        if(tamano%2==1){
            return quickSelect(arreglo, tamano/2, 0, tamano-1);
        } else {
            return 0.5*(quickSelect(arreglo, tamano/2, 0, tamano-1)+quickSelect(arreglo, tamano/2-1, 0, tamano-1));
        } 
    }

   public static int quickSelect(int [] arreglo, int k, int min, int max) {
        while(min<=max) {
            int locPivot = particion(arreglo, max, min);
            if(locPivot==k) {
                return arreglo[locPivot];
            } else if (locPivot>k) {
                max=locPivot-1; 
            } else {
                min=locPivot+1;
            } 
        }
        throw new RuntimeException("No se encontro el k-esimo elemento");
    }

    public static void cambio (int [] arreglo, int i, int j) {
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }

    public static int particion (int [] arreglo, int max, int min){
        int pivot = arreglo[max];
        int locPivot = min;

        for(int i=min; i<=max; i++){
            if(arreglo[i]<pivot){
                cambio(arreglo, i, locPivot);
                locPivot++;                                                                    
            }
        }
        cambio(arreglo, locPivot, max);
        return locPivot;
    }

    public static void main(String [] args) {
        int [] arreglo = {3,4,2,6,8,10,5,7,11,1};
        System.out.println("La mediana es: "+ encontrarMediana(arreglo) );
        
    }


}
