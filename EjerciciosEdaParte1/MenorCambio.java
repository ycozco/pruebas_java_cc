package EjerciciosEdaParte1;

public class MenorCambio {

    public static void main(String[] args) {
        int [] monedas = {50, 100, 200, 500};
        int gasto = 650;
        int pago = 2000;
        int vuelto = pago-gasto;
        System.out.println("El minimo de monedas es: " + menorCambio(monedas, vuelto));

    }

    public static int menorCambio (int [] monedas, int cantidad) {
        if(cantidad==0) return 0;

        for(int i=0; i<=monedas.length; i++){
            
        }


        return 0;
    }



}
