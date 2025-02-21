import java.util.ArrayList;
import java.util.List;

public class GestionGuarderia {
    private List<Nino> ninosMatriculados;

    public GestionGuarderia() {
        this.ninosMatriculados = new ArrayList<>();
    }

    public void registrarNino(Nino nino) {
        if (buscarNino(nino.getDocumentoIdentidad()) == null) {
            ninosMatriculados.add(nino);
            System.out.println("Nino registrado exitosamente.");
        } else {
            System.out.println("El nino ya está registrado.");
        }
    }

    public Nino buscarNino(String documentoIdentidad) {
        return ninosMatriculados.stream()
                .filter(n -> n.getDocumentoIdentidad().equals(documentoIdentidad))
                .findFirst()
                .orElse(null);
    }

    public void actualizarInformacion(Nino ninoActualizado) {
        for (int i = 0; i < ninosMatriculados.size(); i++) {
            if (ninosMatriculados.get(i).getDocumentoIdentidad().equals(ninoActualizado.getDocumentoIdentidad())) {
                ninosMatriculados.set(i, ninoActualizado);
                System.out.println("Información actualizada exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró el nino para actualizar.");
    }

    public void eliminarRegistro(String documentoIdentidad) {
        ninosMatriculados.removeIf(n -> n.getDocumentoIdentidad().equals(documentoIdentidad));
        System.out.println("Registro eliminado exitosamente.");
    }

    public List<Nino> listarNinos() {
        return new ArrayList<>(ninosMatriculados);
    }
}
