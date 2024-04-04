package EjerciciosEdaParte1;

public class MenorCambio {

    private static int [] memoria;
    public static void main(String[] args) {
        int [] monedas = {500, 200, 100, 50};
        int gasto = 650;
        int pago = 2000;
        int vuelto = pago-gasto;
        System.out.println("El minimo de monedas es: " + menorCambio(monedas, vuelto));

    }

    public static int menorCambio (int [] monedas, int vuelto) {
        if(vuelto==0) return 0;
        int contadorMonedas=0;

        for(int i=0; i<=monedas.length; i++){
            if(vuelto%monedas[i]>=0 ){
                int division = vuelto / monedas[i];
                memoria[i]=division;
                vuelto =- division*monedas[i];
            }
        }
        for (int i : memoria) {
            contadorMonedas=+i;
        }

        return contadorMonedas;
    }



}
