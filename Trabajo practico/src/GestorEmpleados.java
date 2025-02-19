import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        this.empleados = new ArrayList<>();
    }

    // Agregar un nuevo empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Listar empleados
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        }
    }

    // Buscar empleado por ID
    public Empleado buscarEmpleado(int id) {
        for (Empleado emp : empleados) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    // Eliminar empleado
    public boolean eliminarEmpleado(int id) {
        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            empleados.remove(empleado);
            return true;
        }
        return false;
    }
}
