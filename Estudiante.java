import java.util.Scanner;

public class Estudiante extends Miembro{
    private String idEstudiante;
    private String carrera;
    private String correoElectronico;
    private String telefono;

    public Estudiante() {
        super();
        this.idEstudiante = "Sin ID";
        this.carrera = "Sin carrera";
        this.correoElectronico = "Sin correo electrónico";
        this.telefono = "Sin teléfono";
    }

    public Estudiante(String nombre, int edad, String genero, String idGrupo, int idEstudiante, String carrera, String correoElectronico, String telefono) {
        super(nombre, edad, genero);
        this.idEstudiante = nombre.substring(0, 3).toUpperCase() 
                          + edad 
                          + idGrupo.substring(0, 3).toUpperCase() 
                          + "-"
                          + idEstudiante;
        this.carrera = carrera;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public void capturarDatos(String idGrupo, int idEstudiante) {
        Scanner teclado = new Scanner(System.in);
        super.capturarDatos();
        
        this.idEstudiante = this.nombre.substring(0, 3).toUpperCase() 
                          + this.edad 
                          + idGrupo.substring(0, 3).toUpperCase() 
                          + "-"
                          + idEstudiante;
        System.out.print("Ingrese la carrera: ");
        this.carrera = teclado.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        this.correoElectronico = teclado.nextLine();
        System.out.print("Ingrese el teléfono: ");
        this.telefono = teclado.nextLine();
    }

    public void presentarDatos() {
        System.out.printf("Nombre: " + this.nombre);
        System.out.println("  Edad: " + this.edad);
    }

    public void consultarEstudiantes() {
        System.out.println("\n----------Datos del estudiante----------");
        System.out.println("ID del estudiante: " + this.idEstudiante);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Género: " + this.genero);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Correo electrónico: " + this.correoElectronico);
        System.out.println("Teléfono: " + this.telefono);
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}