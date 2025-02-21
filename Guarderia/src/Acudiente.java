public class Acudiente {
    private String nombre;
    private String numeroContacto;

    public Acudiente(String nombre, String numeroContacto) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Acudiente{" +
                "nombre='" + nombre + '\'' +
                ", numeroContacto='" + numeroContacto + '\'' +
                '}';
    }
}