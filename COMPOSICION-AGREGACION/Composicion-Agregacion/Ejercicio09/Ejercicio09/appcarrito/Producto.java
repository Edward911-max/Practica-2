
package appcarrito;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String mostrarInfo() {
        return nombre + " - $" + precio;
    }
}

