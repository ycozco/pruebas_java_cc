package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,6);
        Circulo circulo1 = new Circulo(8);

        System.out.println("Área del rectángulo: " + rectangulo1.calcularArea() + "\t Perímetro: " + rectangulo1.calcularPerimetro());
        System.out.println("Área del círculo: " + circulo1.calcularArea() + "\t Perímetro: " + circulo1.calcularPerimetro());
    }
}
