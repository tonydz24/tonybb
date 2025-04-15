import java.util.ArrayList;
import java.util.Scanner;

public class Grupo{
    private String idGrupo;
    private String fechaInicio;
    private Instructor instructor;
    private ArrayList<Estudiante> estudiantes;
    private int cantidadEstudiantes;

    public Grupo() {
        this.idGrupo = "Sin ID";
        this.fechaInicio = "Sin fecha de inicio";
        this.instructor = new Instructor();
        this.estudiantes = new ArrayList<>();
        this.cantidadEstudiantes = 0;
    }

    public Grupo(String idCurso, int contGrupos, String fechaInicio, int cantidadEstudiantes) {
        this.idGrupo = idCurso + "-" + contGrupos;
        this.fechaInicio = fechaInicio;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.instructor = new Instructor();
        this.estudiantes = new ArrayList<>();
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
        System.out.println("Cantidad de estudiantes: " + this.cantidadEstudiantes);
    }

    public void presentarGrupo() {
        int i = 0;

        presentarDatos();
        System.out.print("Instructor: " + this.instructor.getNombre());
        System.out.println("  Edad: " + this.instructor.getEdad());

        if (this.estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n----------Estudiantes registrados----------");
            for (Estudiante tmp : estudiantes) {
                System.out.printf((i + 1) + ".- ");
                tmp.presentarDatos();
                i++;
            }
        }
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

    public void agregarEstudiante(ArrayList<Estudiante> listaEstudiantes) {
        Scanner teclado = new Scanner(System.in);
        Estudiante unEstudiante = null;
        int opcion = 0;

        do {
            unEstudiante = new Estudiante();
            System.out.println("\nDatos del estudiante: ");
            unEstudiante.capturarDatos(this.idGrupo, this.cantidadEstudiantes + 1);
            this.estudiantes.add(unEstudiante);
            listaEstudiantes.add(unEstudiante);
            this.cantidadEstudiantes++;
            do {
                System.out.println("¿Desea agregar otro estudiante? (1: Sí, 2: No)");
                if (teclado.hasNextInt()) {
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    if (opcion != 1 && opcion != 2) {
                        System.out.println("Opción inválida, intente de nuevo.");
                        opcion = 0; 
                    }
                } else {
                    System.out.println("Opción inválida, intente de nuevo.");
                    teclado.nextLine();
                    opcion = 0;
                }
            } while (opcion == 0);
        } while (opcion == 1);
    }

    public void eliminarEstudiante() {
        Scanner teclado = new Scanner(System.in);
        String estudianteBuscado = null;
        int i = 0, encontrado = 0;

        if (this.estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n----------Estudiantes registrados----------");
            for (Estudiante tmp : estudiantes) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdEstudiante());
                tmp.presentarDatos();
                i++;
            }
            System.out.print("Escriba el ID del estudiante que desea eliminar: ");
            estudianteBuscado = teclado.nextLine();
            for (Estudiante tmp : estudiantes) {
                if (tmp.getIdEstudiante().equals(estudianteBuscado)) {
                    this.estudiantes.remove(tmp);
                    this.cantidadEstudiantes--;
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.println("No se encontró el estudiante con ID: " + estudianteBuscado);
            }
        }
    }

    public void consultarEstudiantes() {
        if (this.estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n----------Estudiantes registrados----------");
            for (Estudiante tmp : estudiantes) {
                tmp.consultarEstudiantes();
            }
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

    public void setEstudiantes(Estudiante unEstudiante) {
        this.estudiantes.add(unEstudiante);
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
}