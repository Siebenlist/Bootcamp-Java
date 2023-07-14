public class ProjectTest {
    private String nombre;
    private String descripcion;

    //Nuevo proyecto vacio
    public ProjectTest(){
        this.nombre = "";
        this.descripcion = "";
    }

    //Nuevo proyecto con nombre
    public ProjectTest(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
    }

    //Nuevo proyecto con nombre y descripcion
    public ProjectTest(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Funcion para agarrar el nombre
    public String getNombre(){
        return nombre;
    }

    //Funcion para setear el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Funcion para agarrar la descripcion
    public String getDescripcion(){
        return descripcion;
    }

    //Funcion para setear la descripcion
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    //Funcion para agarrar el nombre y la descripcion
    public String getAll() {
        return nombre + " : " + descripcion;
    }
}
