public class prueba {
    public static void main(String[] args) {

        int[] lista2 = { 4, 2, 5 };
        int[] lista;
        lista = new int[]{4,5,2,1}; 


        int suma=0;
        for(int i=0; i<lista.length; i++){
            suma+=lista[i];
        }

        int suma2=0;
        for (int i : lista2) {
            suma2+=i;
        }
        System.out.println("Suma1:" + suma);
        System.out.println("Suma2:" + suma2);
    }
}