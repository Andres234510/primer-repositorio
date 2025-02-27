class Niño {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String acudiente;
    private String contactoAcudiente;

    public Niño(String id, String nombre, int edad, String genero, String documento,
                String alergias, String acudiente, String contactoAcudiente) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.acudiente = acudiente;
        this.contactoAcudiente = contactoAcudiente;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Niño{" + "ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad +
                ", Género=" + genero + ", Documento=" + documento +
                ", Alergias=" + alergias + ", Acudiente=" + acudiente +
                ", Contacto=" + contactoAcudiente + '}';
    }
}
