import java.util.ArrayList;

class Guarderia {
    private ArrayList<Niño> listaNiños = new ArrayList<>();

    public void agregarNiño(Niño n) {
        listaNiños.add(n);
    }

    public void mostrarNiños() {
        for (Niño n : listaNiños) {
            System.out.println(n);
        }
    }

    public void mostrarMayoresDe5() {
        System.out.println("Niños mayores de 5 años:");
        for (Niño n : listaNiños) {
            if (n.getEdad() > 5) {
                System.out.println(n);
            }
        }
    }
}
