public class Estudiante {
    private String nombre;
    private String carrera;
    private String id;
    private String modalidad;

    public Estudiante() {
    }
    public Estudiante(String nombre, String carrera, String id, String modalidad) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getId() {
        return id;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String detalleEst(){
        return "Nombre del Estudiante: "+getNombre()+"\n"+
                "Carrera: "+getCarrera()+"\n"+
                "ID: "+getId()+"\n"+
                "Modalidad: "+getModalidad();

    }
}
