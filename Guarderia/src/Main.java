import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de la guardería
        GestionGuarderia guarderia = new GestionGuarderia();

        // Crear algunos acudientes
        Acudiente acudiente1 = new Acudiente("Juan Pérez", "123456789");
        Acudiente acudiente2 = new Acudiente("María López", "987654321");

        // Crear algunos niños
        Niño niño1 = new Niño("Ana Pérez", 4, "Femenino", "DOC001", "Ninguna", acudiente1);
        Niño niño2 = new Niño("Carlos López", 3, "Masculino", "DOC002", "Alergia al maní", acudiente2);

        // Probar registro de niños
        System.out.println("\n--- Registrando niños ---");
        guarderia.registrarNiño(niño1);
        guarderia.registrarNiño(niño2);

        // Probar búsqueda
        System.out.println("\n--- Buscando niño ---");
        Niño encontrado = guarderia.buscarNiño("DOC001");
        System.out.println("Niño encontrado: " + encontrado);

        // Probar actualización
        System.out.println("\n--- Actualizando información ---");
        niño1.setAlergias("Alergia al polen");
        guarderia.actualizarInformacion(niño1);

        // Probar listado
        System.out.println("\n--- Listando todos los niños ---");
        List<Niño> lista = guarderia.listarNiños();
        lista.forEach(System.out::println);

        // Probar eliminación
        System.out.println("\n--- Eliminando registro ---");
        guarderia.eliminarRegistro("DOC002");

        // Mostrar lista actualizada
        System.out.println("\n--- Lista actualizada ---");
        guarderia.listarNiños().forEach(System.out::println);
    }
}
