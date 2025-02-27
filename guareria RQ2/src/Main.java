public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();

        Niño niño1 = new Niño("001", "Juan Pérez", 4, "Masculino", "12345678", "Ninguna", "Ana Pérez", "555-1234");
        Niño niño2 = new Niño("002", "María Gómez", 6, "Femenino", "87654321", "Polen", "Luis Gómez", "555-5678");

        guarderia.agregarNiño(niño1);
        guarderia.agregarNiño(niño2);

        System.out.println("Lista de niños:");
        guarderia.mostrarNiños();

        guarderia.mostrarMayoresDe5();
    }
}