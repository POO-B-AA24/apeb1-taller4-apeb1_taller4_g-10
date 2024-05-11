import java.util.Scanner;
import java.util.ArrayList;


public class Problema_2_GestionEmpleados {
   public ArrayList<Problema_2_Empleado> empleados = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void agregarEmpleado() {
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        Problema_2_Empleado empleado = new Problema_2_Empleado(nombre, salario, edad);
        empleados.add(empleado);
    }

    public void mostrarInformacionEmpleados() {
        for (Problema_2_Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public void calcularAumentoSalario() {
        double totalSalarios = 0;
        for (Problema_2_Empleado empleado : empleados) {
            totalSalarios += empleado.salario;
        }
        double salarioPromedio = totalSalarios / empleados.size();

        System.out.println("Ingrese el porcentaje de aumento salarial:");
        double porcentajeAumento = scanner.nextDouble();

        for (Problema_2_Empleado empleado : empleados) {
            if (empleado.salario < salarioPromedio) {
                empleado.aumentarSalario(porcentajeAumento);
                System.out.println("Nuevo salario de " + empleado.nombre + ": " + empleado.salario);
            }
        }
    }
}
