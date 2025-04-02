import java.util.Scanner;

public class Instructor extends Miembro {
    private int idInstructor;
    private String gradoAcademico;
    private String areaEspecialidad;
    private int aniosExperiencia;
    private String correoElectronico;

    public Instructor() {
        super();
        this.idInstructor = 0;
        this.gradoAcademico = "Sin grado académico";
        this.areaEspecialidad = "Sin área de especialidad";
        this.aniosExperiencia = 0;
        this.correoElectronico = "Sin correo electrónico";
    }

    public Instructor(String nombre, int edad, String genero, int idInstructor, String gradoAcademico, String areaEspecialidad, int aniosExperiencia, String correoElectronico) {
        super(nombre, edad, genero);
        this.idInstructor = idInstructor;
        this.gradoAcademico = gradoAcademico;
        this.areaEspecialidad = areaEspecialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.correoElectronico = correoElectronico;
    }

    public void capturarDatos(int idInstructor) {
        Scanner teclado = new Scanner(System.in);
        super.capturarDatos(); // Captura los datos del miembro
        this.idInstructor = idInstructor;
        System.out.print("Ingrese el grado académico: ");
        this.gradoAcademico = teclado.nextLine();
        System.out.print("Ingrese el área de especialidad: ");
        this.areaEspecialidad = teclado.nextLine();
        System.out.print("Ingrese los años de experiencia: ");
        this.aniosExperiencia = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el correo electrónico: ");
        this.correoElectronico = teclado.nextLine();
    }

    public int getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(int idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
