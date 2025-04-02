import java.util.Scanner;

public class Estudiante extends Miembro{
    private int idEstudiante;
    private String carrera;
    private String correoElectronico;
    private String telefono;

    public Estudiante() {
        super();
        this.idEstudiante = 0;
        this.carrera = "Sin carrera";
        this.correoElectronico = "Sin correo electrónico";
        this.telefono = "Sin teléfono";
    }

    public Estudiante(String nombre, int edad, String genero, int idEstudiante, String carrera, String correoElectronico, String telefono) {
        super(nombre, edad, genero);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public void capturarDatos(int idEstudiante) {
        Scanner teclado = new Scanner(System.in);
        super.capturarDatos(); // Captura los datos del miembro
        this.idEstudiante = idEstudiante;
        System.out.print("Ingrese la carrera: ");
        this.carrera = teclado.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        this.correoElectronico = teclado.nextLine();
        System.out.print("Ingrese el teléfono: ");
        this.telefono = teclado.nextLine();
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
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
