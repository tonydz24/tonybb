import java.util.ArrayList;
import java.util.Scanner;

public class Grupo extends Curso{
    private String idGrupo;
    private String fechaInicio;
    private Instructor instructor;
    private ArrayList<Estudiante> estudiantes;
    private int cantidadEstudiantes;

    public Grupo() {
        super();
        this.idGrupo = "Sin ID";
        this.fechaInicio = "Sin fecha de inicio";
        this.instructor = new Instructor();
        this.estudiantes = new ArrayList<>();
        this.cantidadEstudiantes = 0;
    }

    public Grupo(String idGrupo, String fechaInicio, Instructor instructor, ArrayList<Estudiante> estudiantes, int cantidadEstudiantes) {
        super();
        this.idGrupo = idGrupo;
        this.fechaInicio = fechaInicio;
        this.instructor = instructor;
        this.estudiantes = estudiantes;
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public void capturarDatos(String idCurso, int contGrupos) {
        Scanner teclado = new Scanner(System.in);
        this.idGrupo = idCurso + "-" + contGrupos;
        System.out.print("Ingrese la fecha de inicio (DD/MM/AAAA): ");
        this.fechaInicio = teclado.nextLine();
        System.out.println("Datos del instructor: ");
        this.instructor.capturarDatos();
    }

    public void presentarDatos() {
        System.out.println("\n----------Datos del grupo----------");
        System.out.println("ID del grupo: " + this.idGrupo);
        System.out.println("Fecha de inicio: " + this.fechaInicio);
        System.out.println("Instructor: " + this.instructor.getNombre());
        System.out.println("Cantidad de estudiantes: " + this.cantidadEstudiantes);
    }

    public void modificarDatos() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.print("Ingrese la nueva fecha de inicio (DD/MM/AAAA): ");
        this.fechaInicio = teclado.nextLine();
        System.out.println("Si desea modificar los datos del instructor presione 1");
        System.out.println("Si desea agregar un nuevo instructor presione 2");
        System.out.println("Si no quiere modificarlo presione cualquier tecla");
        System.out.print("Respuesta: ");
        if (teclado.hasNextInt()) {
            opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 1) {
                System.out.println("Datos del instructor: ");
                this.instructor.modificarDatos();
            } else {
                if (opcion == 2) {
                    this.instructor = new Instructor();
                    System.out.println("Datos del nuevo instructor: ");
                    this.instructor.capturarDatos();
                } else {
                    return;
                }
            }
        } else {
            return;
        }       
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
}
