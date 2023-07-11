/*
 clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni
 */
package guia3ejer2;
  import java.time.LocalDate;



public class Empleado {
    
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
    private String dni;

    public Empleado(String nombre, String apellido, LocalDate fechaIngreso, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
   

  

