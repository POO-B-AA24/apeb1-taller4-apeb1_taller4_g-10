package trabajogrupal;

class Problema_1_Productos {

    public double precio;
    public int cantidad;

    public Problema_1_Productos(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularDescuento() {
        return (precio >= 1000 && cantidad >= 10) ? 0.1 : 0.05;
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        double precioTotal = precio * cantidad;
        double precioFinal = precioTotal * (1 - descuento);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Precio unitario: $" + precio + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Descuento: " + (calcularDescuento() * 100) + "%\n"
                + "Precio final: $" + calcularPrecioFinal();
    }
}
