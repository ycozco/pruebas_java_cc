class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String numeroPlacas, String color, String modelo, int cilindrada) {
        super(numeroPlacas, color, modelo);
        this.cilindrada = cilindrada;
    }

    public void encender() {
        System.out.println(this.modelo + " está encendiendo.");
    }

    public void apagar() {
        System.out.println(this.modelo + " está apagando.");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
