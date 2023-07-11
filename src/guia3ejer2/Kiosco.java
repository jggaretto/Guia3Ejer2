/*
 Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado
 */
package guia3ejer2;


public class Kiosco {
    private String direccion;
    private String nombre;
    private String cuit;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosco(String direccion, String nombre, String cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado1 == null) {
            empleado1 = empleado;
        } else if (empleado2 == null) {
            empleado2 = empleado;
        } else if (empleado3 == null) {
            empleado3 = empleado;
        }
    }

    public Empleado obtenerEmpleadoAntiguo() {
        Empleado antiguo = empleado1;
        if (empleado2 != null && empleado2.getFechaIngreso().isBefore(antiguo.getFechaIngreso())) {
            antiguo = empleado2;
        }
        if (empleado3 != null && empleado3.getFechaIngreso().isBefore(antiguo.getFechaIngreso())) {
            antiguo = empleado3;
        }
        return antiguo;
    }
}

