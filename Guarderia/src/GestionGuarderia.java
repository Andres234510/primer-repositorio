import java.util.ArrayList;
import java.util.List;

public class GestionGuarderia {
    private List<Niño> niñosMatriculados;

    public GestionGuarderia() {
        this.niñosMatriculados = new ArrayList<>();
    }

    public void registrarNiño(Niño niño) {
        if (buscarNiño(niño.getDocumentoIdentidad()) == null) {
            niñosMatriculados.add(niño);
            System.out.println("Niño registrado exitosamente.");
        } else {
            System.out.println("El niño ya está registrado.");
        }
    }

    public Niño buscarNiño(String documentoIdentidad) {
        return niñosMatriculados.stream()
                .filter(n -> n.getDocumentoIdentidad().equals(documentoIdentidad))
                .findFirst()
                .orElse(null);
    }

    public void actualizarInformacion(Niño niñoActualizado) {
        for (int i = 0; i < niñosMatriculados.size(); i++) {
            if (niñosMatriculados.get(i).getDocumentoIdentidad().equals(niñoActualizado.getDocumentoIdentidad())) {
                niñosMatriculados.set(i, niñoActualizado);
                System.out.println("Información actualizada exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró el niño para actualizar.");
    }

    public void eliminarRegistro(String documentoIdentidad) {
        niñosMatriculados.removeIf(n -> n.getDocumentoIdentidad().equals(documentoIdentidad));
        System.out.println("Registro eliminado exitosamente.");
    }

    public List<Niño> listarNiños() {
        return new ArrayList<>(niñosMatriculados);
    }
}
