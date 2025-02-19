import java.util.Date;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private String correo;
    private String telefono;
    private Date fechaContratacion;

    public Empleado(int id, String nombre, String puesto, String correo, String telefono, Date fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public String getCorreo() { return correo; }
    public String getTelefono() { return telefono; }
    public Date getFechaContratacion() { return fechaContratacion; }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto +
                ", Correo: " + correo + ", Teléfono: " + telefono + ", Fecha Contratación: " + fechaContratacion;
    }
}

