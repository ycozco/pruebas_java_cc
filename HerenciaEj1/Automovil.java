class Automovil extends Vehiculo { // Clase que representa un automóvil, heredando de la clase Vehiculo

    private int numeroPuertas; // Número de puertas del automóvil

    public Automovil(String numeroPlacas, String color, String modelo, int numeroPuertas) { // Constructor de la clase
        super(numeroPlacas, color, modelo); // Se llama al constructor de la clase padre
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirPuertas() { // Método para abrir las puertas del automóvil
        System.out.println(this.modelo + " está abriendo las puertas.");
    }

    public void cerrarPuertas() { // Método para cerrar las puertas del automóvil
        System.out.println(this.modelo + " está cerrando las puertas.");
    }

    public int getNumeroPuertas() { // Getter para obtener el número de puertas
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) { // Setter para establecer el número de puertas
        this.numeroPuertas = numeroPuertas;
    }
}

