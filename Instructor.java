import java.util.Scanner;

public class Instructor extends Miembro {
    private String idInstructor;
    private String gradoAcademico;
    private String areaEspecialidad;
    private int aniosExperiencia;
    private String correoElectronico;

    public Instructor() {
        super();
        this.idInstructor = "Sin ID";
        this.gradoAcademico = "Sin grado académico";
        this.areaEspecialidad = "Sin área de especialidad";
        this.aniosExperiencia = 0;
        this.correoElectronico = "Sin correo electrónico";
    }

    public Instructor(String nombre, int edad, String genero, String idInstructor, String gradoAcademico, String areaEspecialidad, int aniosExperiencia, String correoElectronico) {
        super(nombre, edad, genero);
        this.idInstructor = idInstructor;
        this.gradoAcademico = gradoAcademico;
        this.areaEspecialidad = areaEspecialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.correoElectronico = correoElectronico;
    }

    public void capturarDatos() {
        Scanner teclado = new Scanner(System.in);
        super.capturarDatos(); 
        this.idInstructor = this.nombre.substring(0, 3).toUpperCase() 
                          + this.edad 
                          + this.nombre.substring(this.nombre.length() - 3).toUpperCase() 
                          + (int) (Math.random() * 1000);
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

    public void modificarDatos() {
        Scanner teclado = new Scanner(System.in);
        super.modificarDatos(); 
        System.out.print("Ingrese el nuevo grado académico: ");
        this.gradoAcademico = teclado.nextLine();
        System.out.print("Ingrese el nuevo área de especialidad: ");
        this.areaEspecialidad = teclado.nextLine();
        System.out.print("Ingrese los nuevos años de experiencia: ");
        this.aniosExperiencia = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el nuevo correo electrónico: ");
        this.correoElectronico = teclado.nextLine();
    }

    public void presentarDatos() {
        System.out.println("\n----------Datos del instructor----------");
        System.out.println("ID del instructor: " + this.idInstructor);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Género: " + this.genero);
        System.out.println("Grado académico: " + this.gradoAcademico);
        System.out.println("Área de especialidad: " + this.areaEspecialidad);
        System.out.println("Años de experiencia: " + this.aniosExperiencia);
        System.out.println("Correo electrónico: " + this.correoElectronico);
    }

    public String getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(String idInstructor) {
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
