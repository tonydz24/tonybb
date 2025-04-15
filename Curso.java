import java.util.Scanner;
import java.util.ArrayList;

public class Curso implements Comparable<Curso> {
    protected String idCurso;
    protected String nombreCurso;
    protected int diasDuracion;
    protected int cantidadGrupos;
    protected ArrayList<Grupo> listaGrupos;

    public Curso() {
        this.idCurso = "Sin ID";
        this.nombreCurso = "Sin nombre";
        this.diasDuracion = 0;
        this.cantidadGrupos = 0;
        this.listaGrupos = new ArrayList<>();
    }

    public Curso(String nombreCurso, int diasDuracion, int cantidadGrupos) {
        this.idCurso = nombreCurso.substring(0, 3).toUpperCase() 
                     + (int) (Math.random() * 1000) 
                     + nombreCurso.substring(nombreCurso.length() - 3).toUpperCase();
        this.nombreCurso = nombreCurso;
        this.diasDuracion = diasDuracion;
        this.cantidadGrupos = cantidadGrupos;
        this.listaGrupos = new ArrayList<>();
    }

    public void capturarDatos() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        this.nombreCurso = teclado.nextLine();
        System.out.print("Ingrese la duración en días: ");
        this.diasDuracion = teclado.nextInt();
        teclado.nextLine();
        String idCurso = this.nombreCurso.substring(0, 3).toUpperCase() 
                       + (int) (Math.random() * 1000) 
                       + this.nombreCurso.substring(this.nombreCurso.length() - 3).toUpperCase();
        this.idCurso = idCurso;
    }

    public void presentarDatos() {
        System.out.println("\n----------Datos del curso----------");
        System.out.println("ID del curso: " + this.idCurso);
        System.out.println("Nombre del curso: " + this.nombreCurso);
        System.out.println("Duración en días: " + this.diasDuracion);
        System.out.println("Cantidad de grupos: " + this.cantidadGrupos);

        if (this.listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                tmp.presentarDatos();
            }
        }
    }

    public void agregarGrupo(ArrayList<Instructor> listaInstructores) {
        Grupo nuevoGrupo = new Grupo();

        System.out.println("Datos del nuevo grupo:");
        this.cantidadGrupos++;
        nuevoGrupo.capturarDatos(idCurso, cantidadGrupos);
        listaInstructores.add(nuevoGrupo.getInstructor());
        this.listaGrupos.add(nuevoGrupo);
    }

    public void modificarGrupo(ArrayList<Instructor> listaInstructores) {
        Scanner teclado = new Scanner(System.in);
        int i = 0, option = 0, encontrado =0;
        String grupoBuscado = null;
        String instructorBuscado = null;

        if (listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados para modificar.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdGrupo());
                i++;
            }
            System.out.print("Escriba el ID del grupo que desea modificar: ");
            grupoBuscado = teclado.nextLine();
            for (Grupo tmp : listaGrupos) {
                if (tmp.getIdGrupo().equals(grupoBuscado)) {
                    tmp.modificarDatos();
                    instructorBuscado = tmp.getInstructor().getIdInstructor();
                    for (Instructor instructor : listaInstructores) {
                        if (instructor.getIdInstructor().equals(instructorBuscado)) {
                            encontrado = 1;
                        }
                    }
                    if (encontrado == 0) {
                        listaInstructores.add(tmp.getInstructor());
                    }
                    option = 100;
                    break;
                }
            }
            if (option != 100) {
                System.out.println("No se encontró el grupo con ID: " + grupoBuscado);
            }
        }
    }

    public void consultarGrupo() {
        Scanner teclado = new Scanner(System.in);
        int i = 0, opcion = 0;
        String grupoBuscado = null;

        if (listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdGrupo());
                i++;
            }
            System.out.print("Escriba el ID del grupo que desea consultar: ");
            grupoBuscado = teclado.nextLine();
            for (Grupo tmp : listaGrupos) {
                if (tmp.getIdGrupo().equals(grupoBuscado)) {
                    tmp.presentarGrupo();
                    opcion = 100;
                    break;
                }
            }
            if (opcion != 100) {
                System.out.println("No se encontró el grupo con ID: " + grupoBuscado);
            }
        }
    }

    public void agregarEstudiante(ArrayList<Estudiante> listaEstudiantes) {
        Scanner teclado = new Scanner(System.in);
        String grupoBuscado = null;
        int i = 0, encontrado = 0;

        if (listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdGrupo());
                i++;
            }
            System.out.print("Escriba el ID del grupo al que desea agregar un estudiante: ");
            grupoBuscado = teclado.nextLine();
            for (Grupo tmp : listaGrupos) {
                if (tmp.getIdGrupo().equals(grupoBuscado)) {
                    tmp.agregarEstudiante(listaEstudiantes);
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.println("No se encontró el grupo con ID: " + grupoBuscado);
            }
        }
    }

    public void eliminarEstudiante() {
        Scanner teclado = new Scanner(System.in);
        String grupoBuscado = null;
        int i = 0, encontrado = 0;

        if (listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdGrupo());
                i++;
            }
            System.out.print("Escriba el ID del grupo al que desea eliminar un estudiante: ");
            grupoBuscado = teclado.nextLine();
            for (Grupo tmp : listaGrupos) {
                if (tmp.getIdGrupo().equals(grupoBuscado)) {
                    tmp.eliminarEstudiante();
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.println("No se encontró el grupo con ID: " + grupoBuscado);
            }
        }
    }

    public void consultarEstudiantes() {
        Scanner teclado = new Scanner(System.in);
        String grupoBuscado = null;
        int i = 0, encontrado = 0;

        if (listaGrupos.isEmpty()) {
            System.out.println("No hay grupos registrados.");
        } else {
            System.out.println("\n----------Grupos registrados----------");
            for (Grupo tmp : listaGrupos) {
                System.out.println((i + 1) +  ") ID: " + tmp.getIdGrupo());
                i++;
            }
            System.out.print("Escriba el ID del grupo al que desea consultar los estudiantes: ");
            grupoBuscado = teclado.nextLine();
            for (Grupo tmp : listaGrupos) {
                if (tmp.getIdGrupo().equals(grupoBuscado)) {
                    tmp.consultarEstudiantes();
                    encontrado = 1;
                    break;
                }
            }
            if (encontrado == 0) {
                System.out.println("No se encontró el grupo con ID: " + grupoBuscado);
            }
        }
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDiasDuracion() {
        return diasDuracion;
    }

    public void setDiasDuracion(int diasDuracion) {
        this.diasDuracion = diasDuracion;
    }

    public int getCantidadGrupos() {
        return cantidadGrupos;
    }

    public void setCantidadGrupos(int cantidadGrupos) {
        this.cantidadGrupos = cantidadGrupos;
    }

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(Grupo unGrupo) {
        this.listaGrupos.add(unGrupo);
    }

    @Override
    public int compareTo(Curso o) {
        return this.idCurso.compareTo(o.getIdCurso());
    }
}