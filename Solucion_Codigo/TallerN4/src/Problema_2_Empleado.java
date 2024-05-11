public class Problema_2_Empleado {
    public String nombre;
    public double salario;
    public int edad;

    public Problema_2_Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    
    public void aumentarSalario(double porcentajeAumento) {
        double aumento = salario * (porcentajeAumento / 100);
        salario += aumento;
    }

    @Override
    public String toString() {
        return "Problema_2_Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }
    
    
}
