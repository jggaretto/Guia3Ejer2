/*
Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.

Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
de mayor antigüedad.
 */
package guia3ejer2;

import java.time.LocalDate;


public class Guia3Ejer2 {

   
    public static void main(String[] args) {
      Kiosco kiosco = new Kiosco("Av. Rivadavia 1234", "Kiosco de Juan", "20-12345678-5");
        Empleado empleado1 = new Empleado("Juan", "Perez", LocalDate.of(2021, 1, 1), "11111111");
        Empleado empleado2 = new Empleado("Ana", "Gomez", LocalDate.of(2020, 12, 31), "22222222");
        Empleado empleado3 = new Empleado("Pedro", "Garcia", LocalDate.of(2021, 3, 15), "33333333");
        kiosco.agregarEmpleado(empleado1);
        kiosco.agregarEmpleado(empleado2);
        kiosco.agregarEmpleado(empleado3);
        Empleado empleadoAntiguo = kiosco.obtenerEmpleadoAntiguo();
        System.out.println("El empleado con mayor antigüedad es:");
        System.out.println("Nombre: " + empleadoAntiguo.getNombre());
        System.out.println("Apellido: " + empleadoAntiguo.getApellido());
        System.out.println("Fecha de ingreso: " + empleadoAntiguo.getFechaIngreso());
        System.out.println("DNI: " + empleadoAntiguo.getDni());
    }
}
