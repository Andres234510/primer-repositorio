import java.util.Scanner;
import java.util.List;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GestionGuarderia guarderia = new GestionGuarderia();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    registrarNuevoNino();
                    break;
                case 2:
                    buscarNino();
                    break;
                case 3:
                    actualizarNino();
                    break;
                case 4:
                    eliminarNino();
                    break;
                case 5:
                    listarNinos();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
        System.out.println("¡Gracias por usar el sistema!");
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN GUARDERÍA PEQUEÑOS GIGANTES ===");
        System.out.println("1. Registrar nuevo nino");
        System.out.println("2. Buscar nino");
        System.out.println("3. Actualizar información de nino");
        System.out.println("4. Eliminar registro de nino");
        System.out.println("5. Listar todos los ninos");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void registrarNuevoNino() {
        System.out.println("\n--- REGISTRO DE NUEVO NIÑO ---");

        // Datos del nino
        System.out.print("Nombre del nino: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.print("Género (M/F): ");
        String genero = scanner.nextLine();

        System.out.print("Documento de identidad: ");
        String documentoIdentidad = scanner.nextLine();

        System.out.print("Alergias (escriba 'Ninguna' si no tiene): ");
        String alergias = scanner.nextLine();

        // Datos del acudiente
        System.out.println("\n--- DATOS DEL ACUDIENTE ---");
        System.out.print("Nombre del acudiente: ");
        String nombreAcudiente = scanner.nextLine();

        System.out.print("Número de contacto: ");
        String numeroContacto = scanner.nextLine();

        // Crear objetos y registrar
        Acudiente acudiente = new Acudiente(nombreAcudiente, numeroContacto);
        Nino nino = new Nino(nombre, edad, genero, documentoIdentidad, alergias, acudiente);
        guarderia.registrarNino(nino);
    }

    private static void buscarNino() {
        System.out.println("\n--- BÚSQUEDA DE NIÑO ---");
        System.out.print("Ingrese el documento de identidad: ");
        String documento = scanner.nextLine();

        Nino encontrado = guarderia.buscarNino(documento);
        if (encontrado != null) {
            System.out.println("Niño encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("No se encontró ningún nino con ese documento.");
        }
    }

    private static void actualizarNino() {
        System.out.println("\n--- ACTUALIZACIÓN DE INFORMACIÓN ---");
        System.out.print("Ingrese el documento de identidad del niño a actualizar: ");
        String documento = scanner.nextLine();

        Nino ninoExistente = guarderia.buscarNino(documento);
        if (ninoExistente != null) {
            System.out.println("Información actual: " + ninoExistente);
            System.out.println("\nIngrese los nuevos datos (presione Enter para mantener el valor actual):");

            System.out.print("Nombre (" + ninoExistente.getNombre() + "): ");
            String nombre = scanner.nextLine();
            if (!nombre.isEmpty()) ninoExistente.setNombre(nombre);

            System.out.print("Edad (" + ninoExistente.getEdad() + "): ");
            String edadStr = scanner.nextLine();
            if (!edadStr.isEmpty()) ninoExistente.setEdad(Integer.parseInt(edadStr));

            System.out.print("Alergias (" + ninoExistente.getAlergias() + "): ");
            String alergias = scanner.nextLine();
            if (!alergias.isEmpty()) ninoExistente.setAlergias(alergias);

            // Actualizar datos del acudiente
            System.out.print("Número de contacto del acudiente (" +
                    ninoExistente.getAcudiente().getNumeroContacto() + "): ");
            String contacto = scanner.nextLine();
            if (!contacto.isEmpty()) ninoExistente.getAcudiente().setNumeroContacto(contacto);

            guarderia.actualizarInformacion(ninoExistente);
        } else {
            System.out.println("No se encontró ningún niño con ese documento.");
        }
    }

    private static void eliminarNino() {
        System.out.println("\n--- ELIMINACIÓN DE REGISTRO ---");
        System.out.print("Ingrese el documento de identidad del niño a eliminar: ");
        String documento = scanner.nextLine();

        Nino ninoAEliminar = guarderia.buscarNino(documento);
        if (ninoAEliminar != null) {
            System.out.println("Se eliminará el siguiente registro:");
            System.out.println(ninoAEliminar);
            System.out.print("¿Está seguro? (S/N): ");
            String confirmacion = scanner.nextLine();

            if (confirmacion.equalsIgnoreCase("S")) {
                guarderia.eliminarRegistro(documento);
            } else {
                System.out.println("Operación cancelada.");
            }
        } else {
            System.out.println("No se encontró ningún niño con ese documento.");
        }
    }

    private static void listarNinos() {
        System.out.println("\n--- LISTA DE NIÑOS REGISTRADOS ---");
        List<Nino> lista = guarderia.listarNinos();

        if (lista.isEmpty()) {
            System.out.println("No hay niños registrados en el sistema.");
        } else {
            for (Nino nino : lista) {
                System.out.println("\n" + nino);
            }
            System.out.println("\nTotal de niños registrados: " + lista.size());
        }
    }
}