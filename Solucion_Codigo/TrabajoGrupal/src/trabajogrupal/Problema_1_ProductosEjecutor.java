package trabajogrupal;
import java.util.Scanner;
public class Problema_1_ProductosEjecutor {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        

        Problema_1_Productos venta = new Problema_1_Productos(precio, cantidad);
        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();
        System.out.println("-------------------------");
        System.out.println(venta);
    }
}

