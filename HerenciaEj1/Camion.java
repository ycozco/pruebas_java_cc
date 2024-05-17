class Camion extends Vehiculo { // Clase que representa un camión, heredando de la clase Vehiculo

    private int capacidadCarga; // Capacidad de carga del camión

    public Camion(String numeroPlacas, String color, String modelo, int capacidadCarga) { // Constructor de la clase
        super(numeroPlacas, color, modelo); // Se llama al constructor de la clase padre
        this.capacidadCarga = capacidadCarga;
    }

    public void cargar() { // Método para cargar el camión
        System.out.println(this.modelo + " está cargando.");
    }

    public void descargar() { // Método para descargar el camión
        System.out.println(this.modelo + " está descargando.");
    }

    public int getCapacidadCarga() { // Getter para obtener la capacidad de carga
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) { // Setter para establecer la capacidad de carga
        this.capacidadCarga = capacidadCarga;
    }
}
