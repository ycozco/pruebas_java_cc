package EjerciciosEdaParte1;
import java.util.Arrays;

public class MenorCambioPD {
    private static int memoria[] = new int[100001]; 

    public static void main(String[] args) {
        int [] monedas = {50, 100, 200, 500};
        int gasto = 650;
        int pago = 2000;
        int vuelto = pago-gasto;
        //1350
        // Moneda: 5.0: 2
        // Moneda: 2.0: 1
        // Moneda: 1.0: 1
        // Moneda: 0.5: 1
        // Moneda: 5
        Arrays.fill(memoria, -1);
        System.out.println("Se necesitan " + menorCambio(vuelto, monedas) + " monedas");

    }

    public static int menorCambio(int vuelto, int [] monedas){
        if (vuelto < 0) return Integer.MAX_VALUE;
        if (vuelto == 0) return 0;
        if (memoria[vuelto]!=-1) return memoria[vuelto];
        int respuesta = Integer.MAX_VALUE;
        for (int i = 0; i < monedas.length; i++) {
            respuesta = Math.min(respuesta, menorCambio(vuelto - monedas[i], monedas));
        }
    
        return memoria[vuelto] = respuesta + 1;
    }


}
