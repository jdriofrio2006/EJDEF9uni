public class Universidad {
    private String nombre;
    private String ubicacion;
    private String ciudad;

    public Universidad() {
    }
    public Universidad (String nombre, String ubicacion, String campus){
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCiudad (String ciudad) {
        this.ciudad = ciudad;
    }

    public String detalleUni (){
        return "Nombre de la Universidad: "+getNombre()+"\n"+
                "Ciudad: "+getCiudad()+"\n"+
                "Ubicacion: "+getUbicacion();
    }
}