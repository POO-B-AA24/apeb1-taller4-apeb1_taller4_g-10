import java.util.Scanner;
public class Problema_2_Ejecutor {
    public static void main(String[] args) {
        Problema_2_GestionEmpleados gestionEmpleados = new Problema_2_GestionEmpleados();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar información de empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionEmpleados.agregarEmpleado();
                    break;
                case 2:
                    gestionEmpleados.mostrarInformacionEmpleados();
                    break;
                case 3:
                    gestionEmpleados.calcularAumentoSalario();
                    break;
                case 4:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Ingrese una opcion del 1 al 4.");
                    break;
            }
        } while (opcion != 4);
    }
}

