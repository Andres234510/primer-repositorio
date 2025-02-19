import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Empleados:");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Listar Empleados");
            System.out.println("3. Buscar Empleado por ID");
            System.out.println("4. Eliminar Empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Puesto: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();
                    Empleado empleado = new Empleado(id, nombre, puesto, correo, telefono, new Date());
                    gestor.agregarEmpleado(empleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;
                case 2:
                    gestor.listarEmpleados();
                    break;
                case 3:
                    System.out.print("Ingrese ID del empleado a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Empleado encontrado = gestor.buscarEmpleado(idBuscar);
                    System.out.println(encontrado != null ? encontrado : "Empleado no encontrado.");
                    break;
                case 4:
                    System.out.print("Ingrese ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if (gestor.eliminarEmpleado(idEliminar)) {
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
