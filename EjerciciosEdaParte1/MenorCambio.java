package EjerciciosEdaParte1;

public class MenorCambio {

        public static void main(String[] args) {
        int [] monedas = {500, 200, 100, 50};
        int gasto = 650;
        int pago = 2000;
        int vuelto = pago-gasto;
        int [] listadoMonedas = menorCambio(monedas, vuelto);
        for (int i=0; i<listadoMonedas.length; i++){
            if(listadoMonedas[i]>0){
                System.out.println("Moneda: " + monedas[i]/100.0 + ": " + listadoMonedas[i]);
            }
        }
        System.out.println("Moneda: " + menorCambioRecursivo(monedas, vuelto, monedas.length-1));

    }

    public static int[] menorCambio (int [] monedas, int vuelto) {
       
        int [] listadoMonedas = new int [monedas.length] ;

        for(int i=0; i<monedas.length; i++){
            if(monedas[i]<=vuelto){
                int division = vuelto / monedas[i];
                listadoMonedas[i]=division;
                vuelto -= division*monedas[i];
            }
        }

        return listadoMonedas;
    }


    public static int  menorCambioRecursivo (int [] monedas, int vuelto, int posicion){
        if(vuelto==0) return 0;
        if(vuelto<0) return Integer.MAX_VALUE;

        int monedaIncluida = menorCambioRecursivo(monedas, vuelto-monedas[posicion], posicion-1);
        if(monedaIncluida!=Integer.MAX_VALUE){
            monedaIncluida+=1;
        } 
        int monedaExcluida = menorCambioRecursivo(monedas, vuelto, posicion-1);
        
        return Math.min(monedaIncluida, monedaExcluida);
        
    }

}
