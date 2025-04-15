import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\nSi desea utilizar los datos predeterminados presione 1,");
            System.out.println("de lo contrario presione 2 para ingresar los datos desde 0.");
            System.out.print("Seleccione una opción: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.nextLine(); 
                option = 0; 
            }
        } while (option != 1 && option != 2);

        TreeSet<Curso> arbolCursos = new TreeSet<>();
        ArrayList<Instructor> listaInstructores = new ArrayList<>();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        if (option == 1) {
            System.out.println("Cargando datos predeterminados...");
            
            Curso curso1 = new Curso("Curso de Java", 90, 2);
            Curso curso2 = new Curso("Curso de Base de Datos", 120, 2);

            Grupo grupo1curso1 = new Grupo(curso1.getIdCurso(), 1, "14/04/2025", 10);
            Grupo grupo2curso1 = new Grupo(curso1.getIdCurso(), 2, "15/04/2025", 10);
            Grupo grupo1curso2 = new Grupo(curso2.getIdCurso(), 1, "16/04/2025", 10);
            Grupo grupo2curso2 = new Grupo(curso2.getIdCurso(), 2, "17/04/2025", 10);

            Instructor instructorGrupo1curso1 = new Instructor("Roberto Enrique Lopez Dias", 40, "Masculino", "Maestria", "ITI", 10, "roberto@upemor.edu.mx");
            Instructor instructorGrupo2curso1 = new Instructor("Miguel Angel Ruiz Jaimes", 40, "Masculino", "Doctorado", "ITI", 10, "ruiz@upemor.edu.mx");
            Instructor instructorGrupo1curso2 = new Instructor("Sandra Elizabeth Leon Sosa", 40, "Femenino", "Doctorado", "ITI", 10, "sandra@upemor.edu.mx");
            Instructor instructorGrupo2curso2 = new Instructor("Irma Yazmin Hernandez Baez", 40, "Femenino", "Doctorado", "ITI", 10, "irma@upemor.edu.mx");

            Estudiante estudiante1grupo1curso1 = new Estudiante("Juan Carlos Ramirez Torres", 20, "Masculino", grupo1curso1.getIdGrupo(), 1, "Ingenieria en tecnologias de la informacion", "estudiante1@upemor.edu.mx", "1234567890");
            Estudiante estudiante2grupo1curso1 = new Estudiante("Maria Fernanda Lopez Diaz", 20, "Femenino", grupo1curso1.getIdGrupo(), 2, "Ingenieria en tecnologias de la informacion", "estudiante2@upemor.edu.mx", "1234567890");
            Estudiante estudiante3grupo1curso1 = new Estudiante("Diego Hernandez Perez", 20, "Masculino", grupo1curso1.getIdGrupo(), 3, "Ingenieria en tecnologias de la informacion", "estudiante3@upemor.edu.mx", "1234567890");
            Estudiante estudiante4grupo1curso1 = new Estudiante("Lucia Morales Sanchez", 20, "Femenino", grupo1curso1.getIdGrupo(), 4, "Ingenieria en tecnologias de la informacion", "estudiante4@upemor.edu.mx", "1234567890");
            Estudiante estudiante5grupo1curso1 = new Estudiante("Jorge Luis Gutierrez Rivas", 20, "Masculino", grupo1curso1.getIdGrupo(), 5, "Ingenieria en tecnologias de la informacion", "estudiante5@upemor.edu.mx", "1234567890");
            Estudiante estudiante6grupo1curso1 = new Estudiante("Valeria Torres Aguirre", 20, "Femenino", grupo1curso1.getIdGrupo(), 6, "Ingenieria en tecnologias de la informacion", "estudiante6@upemor.edu.mx", "1234567890");
            Estudiante estudiante7grupo1curso1 = new Estudiante("Andres Felipe Rivera Cruz", 20, "Masculino", grupo1curso1.getIdGrupo(), 7, "Ingenieria en tecnologias de la informacion", "estudiante7@upemor.edu.mx", "1234567890");
            Estudiante estudiante8grupo1curso1 = new Estudiante("Camila Gonzalez Ortega", 20, "Femenino", grupo1curso1.getIdGrupo(), 8, "Ingenieria en tecnologias de la informacion", "estudiante8@upemor.edu.mx", "1234567890");
            Estudiante estudiante9grupo1curso1 = new Estudiante("Luis Miguel Salazar Mejia", 20, "Masculino", grupo1curso1.getIdGrupo(), 9, "Ingenieria en tecnologias de la informacion", "estudiante9@upemor.edu.mx", "1234567890");
            Estudiante estudiante10grupo1curso1 = new Estudiante("Sofia Navarro Campos", 20, "Femenino", grupo1curso1.getIdGrupo(), 10, "Ingenieria en tecnologias de la informacion", "estudiante10@upemor.edu.mx", "1234567890");

            Estudiante estudiante1grupo2curso1 = new Estudiante("Ricardo Mendoza Bravo", 20, "Masculino", grupo2curso1.getIdGrupo(), 1, "Ingenieria en tecnologias de la informacion", "estudiante1@upemor.edu.mx", "1234567890");
            Estudiante estudiante2grupo2curso1 = new Estudiante("Ana Karen Dominguez Ponce", 20, "Femenino", grupo2curso1.getIdGrupo(), 2, "Ingenieria en tecnologias de la informacion", "estudiante2@upemor.edu.mx", "1234567890");
            Estudiante estudiante3grupo2curso1 = new Estudiante("Daniel Alejandro Ruiz Herrera", 20, "Masculino", grupo2curso1.getIdGrupo(), 3, "Ingenieria en tecnologias de la informacion", "estudiante3@upemor.edu.mx", "1234567890");
            Estudiante estudiante4grupo2curso1 = new Estudiante("Isabel Castillo Romero", 20, "Femenino", grupo2curso1.getIdGrupo(), 4, "Ingenieria en tecnologias de la informacion", "estudiante4@upemor.edu.mx", "1234567890");
            Estudiante estudiante5grupo2curso1 = new Estudiante("Jose Manuel Cabrera Soto", 20, "Masculino", grupo2curso1.getIdGrupo(), 5, "Ingenieria en tecnologias de la informacion", "estudiante5@upemor.edu.mx", "1234567890");
            Estudiante estudiante6grupo2curso1 = new Estudiante("Mariana Flores Medina", 20, "Femenino", grupo2curso1.getIdGrupo(), 6, "Ingenieria en tecnologias de la informacion", "estudiante6@upemor.edu.mx", "1234567890");
            Estudiante estudiante7grupo2curso1 = new Estudiante("Emilio Vazquez Duarte", 20, "Masculino", grupo2curso1.getIdGrupo(), 7, "Ingenieria en tecnologias de la informacion", "estudiante7@upemor.edu.mx", "1234567890");
            Estudiante estudiante8grupo2curso1 = new Estudiante("Paola Jimenez Camacho", 20, "Femenino", grupo2curso1.getIdGrupo(), 8, "Ingenieria en tecnologias de la informacion", "estudiante8@upemor.edu.mx", "1234567890");
            Estudiante estudiante9grupo2curso1 = new Estudiante("Gabriel Alonso Treviño Nunez", 20, "Masculino", grupo2curso1.getIdGrupo(), 9, "Ingenieria en tecnologias de la informacion", "estudiante9@upemor.edu.mx", "1234567890");
            Estudiante estudiante10grupo2curso1 = new Estudiante("Karla Susana Chavez Padilla", 20, "Femenino", grupo2curso1.getIdGrupo(), 10, "Ingenieria en tecnologias de la informacion", "estudiante10@upemor.edu.mx", "1234567890");

            Estudiante estudiante1grupo1curso2 = new Estudiante("Alejandro Paredes Molina", 20, "Masculino", grupo1curso2.getIdGrupo(), 1, "Ingenieria en tecnologias de la informacion", "estudiante1@upemor.edu.mx", "1234567890");
            Estudiante estudiante2grupo1curso2 = new Estudiante("Laura Berenice Cordero Ibarra", 20, "Femenino", grupo1curso2.getIdGrupo(), 2, "Ingenieria en tecnologias de la informacion", "estudiante2@upemor.edu.mx", "1234567890");
            Estudiante estudiante3grupo1curso2 = new Estudiante("Sebastian Ayala Fuentes", 20, "Masculino", grupo1curso2.getIdGrupo(), 3, "Ingenieria en tecnologias de la informacion", "estudiante3@upemor.edu.mx", "1234567890");
            Estudiante estudiante4grupo1curso2 = new Estudiante("Regina Olvera Carrillo", 20, "Femenino", grupo1curso2.getIdGrupo(), 4, "Ingenieria en tecnologias de la informacion", "estudiante4@upemor.edu.mx", "1234567890");
            Estudiante estudiante5grupo1curso2 = new Estudiante("Eduardo Martinez Cazares", 20, "Masculino", grupo1curso2.getIdGrupo(), 5, "Ingenieria en tecnologias de la informacion", "estudiante5@upemor.edu.mx", "1234567890");
            Estudiante estudiante6grupo1curso2 = new Estudiante("Fatima Beltran Lugo", 20, "Femenino", grupo1curso2.getIdGrupo(), 6, "Ingenieria en tecnologias de la informacion", "estudiante6@upemor.edu.mx", "1234567890");
            Estudiante estudiante7grupo1curso2 = new Estudiante("Julian Nicolas Reyes Solis", 20, "Masculino", grupo1curso2.getIdGrupo(), 7, "Ingenieria en tecnologias de la informacion", "estudiante7@upemor.edu.mx", "1234567890");
            Estudiante estudiante8grupo1curso2 = new Estudiante("Renata Rangel Valdez", 20, "Femenino", grupo1curso2.getIdGrupo(), 8, "Ingenieria en tecnologias de la informacion", "estudiante8@upemor.edu.mx", "1234567890");
            Estudiante estudiante9grupo1curso2 = new Estudiante("Fernando Arce Castañeda", 20, "Masculino", grupo1curso2.getIdGrupo(), 9, "Ingenieria en tecnologias de la informacion", "estudiante9@upemor.edu.mx", "1234567890");
            Estudiante estudiante10grupo1curso2 = new Estudiante("Daniela Garza Salas", 20, "Femenino", grupo1curso2.getIdGrupo(), 10, "Ingenieria en tecnologias de la informacion", "estudiante10@upemor.edu.mx", "1234567890");

            Estudiante estudiante1grupo2curso2 = new Estudiante("Cristian Uriel Avila Rico", 20, "Masculino", grupo2curso2.getIdGrupo(), 1, "Ingenieria en tecnologias de la informacion", "estudiante1@upemor.edu.mx", "1234567890");
            Estudiante estudiante2grupo2curso2 = new Estudiante("Tania Paulina Escobar Lozano", 20, "Femenino", grupo2curso2.getIdGrupo(), 2, "Ingenieria en tecnologias de la informacion", "estudiante2@upemor.edu.mx", "1234567890");
            Estudiante estudiante3grupo2curso2 = new Estudiante("Rodrigo Morales Estrada", 20, "Masculino", grupo2curso2.getIdGrupo(), 3, "Ingenieria en tecnologias de la informacion", "estudiante3@upemor.edu.mx", "1234567890");
            Estudiante estudiante4grupo2curso2 = new Estudiante("Abril Montserrat Duarte Pineda", 20, "Femenino", grupo2curso2.getIdGrupo(), 4, "Ingenieria en tecnologias de la informacion", "estudiante4@upemor.edu.mx", "1234567890");
            Estudiante estudiante5grupo2curso2 = new Estudiante("Hector Damian Cano Leal", 20, "Masculino", grupo2curso2.getIdGrupo(), 5, "Ingenieria en tecnologias de la informacion", "estudiante5@upemor.edu.mx", "1234567890");
            Estudiante estudiante6grupo2curso2 = new Estudiante("Alexa Guadalupe Serrano Lara", 20, "Femenino", grupo2curso2.getIdGrupo(), 6, "Ingenieria en tecnologias de la informacion", "estudiante6@upemor.edu.mx", "1234567890");
            Estudiante estudiante7grupo2curso2 = new Estudiante("Benjamin Alan Castaño Marquez", 20, "Masculino", grupo2curso2.getIdGrupo(), 7, "Ingenieria en tecnologias de la informacion", "estudiante7@upemor.edu.mx", "1234567890");
            Estudiante estudiante8grupo2curso2 = new Estudiante("Melissa Torres Zepeda", 20, "Femenino", grupo2curso2.getIdGrupo(), 8, "Ingenieria en tecnologias de la informacion", "estudiante8@upemor.edu.mx", "1234567890");
            Estudiante estudiante9grupo2curso2 = new Estudiante("Ivan Eduardo Ochoa Barraza", 20, "Masculino", grupo2curso2.getIdGrupo(), 9, "Ingenieria en tecnologias de la informacion", "estudiante9@upemor.edu.mx", "1234567890");
            Estudiante estudiante10grupo2curso2 = new Estudiante("Natalia Romero Alcantara", 20, "Femenino", grupo2curso2.getIdGrupo(), 10, "Ingenieria en tecnologias de la informacion", "estudiante10@upemor.edu.mx", "1234567890");

            arbolCursos.add(curso1);
            arbolCursos.add(curso2);

            curso1.setListaGrupos(grupo1curso1);
            curso1.setListaGrupos(grupo2curso1);
            curso2.setListaGrupos(grupo1curso2);
            curso2.setListaGrupos(grupo2curso2);

            grupo1curso1.setInstructor(instructorGrupo1curso1);  listaInstructores.add(instructorGrupo1curso1);
            grupo2curso1.setInstructor(instructorGrupo2curso1);  listaInstructores.add(instructorGrupo2curso1);
            grupo1curso2.setInstructor(instructorGrupo1curso2);  listaInstructores.add(instructorGrupo1curso2);
            grupo2curso2.setInstructor(instructorGrupo2curso2);  listaInstructores.add(instructorGrupo2curso2);

            grupo1curso1.setEstudiantes(estudiante1grupo1curso1);  listaEstudiantes.add(estudiante1grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante2grupo1curso1);  listaEstudiantes.add(estudiante2grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante3grupo1curso1);  listaEstudiantes.add(estudiante3grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante4grupo1curso1);  listaEstudiantes.add(estudiante4grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante5grupo1curso1);  listaEstudiantes.add(estudiante5grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante6grupo1curso1);  listaEstudiantes.add(estudiante6grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante7grupo1curso1);  listaEstudiantes.add(estudiante7grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante8grupo1curso1);  listaEstudiantes.add(estudiante8grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante9grupo1curso1);  listaEstudiantes.add(estudiante9grupo1curso1);
            grupo1curso1.setEstudiantes(estudiante10grupo1curso1);  listaEstudiantes.add(estudiante10grupo1curso1);

            grupo2curso1.setEstudiantes(estudiante1grupo2curso1);  listaEstudiantes.add(estudiante1grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante2grupo2curso1);  listaEstudiantes.add(estudiante2grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante3grupo2curso1);  listaEstudiantes.add(estudiante3grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante4grupo2curso1);  listaEstudiantes.add(estudiante4grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante5grupo2curso1);  listaEstudiantes.add(estudiante5grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante6grupo2curso1);  listaEstudiantes.add(estudiante6grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante7grupo2curso1);  listaEstudiantes.add(estudiante7grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante8grupo2curso1);  listaEstudiantes.add(estudiante8grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante9grupo2curso1);  listaEstudiantes.add(estudiante9grupo2curso1);
            grupo2curso1.setEstudiantes(estudiante10grupo2curso1);  listaEstudiantes.add(estudiante10grupo2curso1);

            grupo1curso2.setEstudiantes(estudiante1grupo1curso2);  listaEstudiantes.add(estudiante1grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante2grupo1curso2);  listaEstudiantes.add(estudiante2grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante3grupo1curso2);  listaEstudiantes.add(estudiante3grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante4grupo1curso2);  listaEstudiantes.add(estudiante4grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante5grupo1curso2);  listaEstudiantes.add(estudiante5grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante6grupo1curso2);  listaEstudiantes.add(estudiante6grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante7grupo1curso2);  listaEstudiantes.add(estudiante7grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante8grupo1curso2);  listaEstudiantes.add(estudiante8grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante9grupo1curso2);  listaEstudiantes.add(estudiante9grupo1curso2);
            grupo1curso2.setEstudiantes(estudiante10grupo1curso2);  listaEstudiantes.add(estudiante10grupo1curso2);

            grupo2curso2.setEstudiantes(estudiante1grupo2curso2);  listaEstudiantes.add(estudiante1grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante2grupo2curso2);  listaEstudiantes.add(estudiante2grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante3grupo2curso2);  listaEstudiantes.add(estudiante3grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante4grupo2curso2);  listaEstudiantes.add(estudiante4grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante5grupo2curso2);  listaEstudiantes.add(estudiante5grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante6grupo2curso2);  listaEstudiantes.add(estudiante6grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante7grupo2curso2);  listaEstudiantes.add(estudiante7grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante8grupo2curso2);  listaEstudiantes.add(estudiante8grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante9grupo2curso2);  listaEstudiantes.add(estudiante9grupo2curso2);
            grupo2curso2.setEstudiantes(estudiante10grupo2curso2);  listaEstudiantes.add(estudiante10grupo2curso2);
        }
        
        do {
            System.out.println("\n----------Menu Principal----------");
            System.out.println("1. Agregar y consultar cursos");
            System.out.println("2. Agregar, modificar y consultar grupos");
            System.out.println("3. Agregar, elminar y consultar estudiantes");
            System.out.println("4. Consultar instructores");
            System.out.println("5. Consltar estudiantes");
            System.out.println("6. Salir");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                teclado.nextLine();
                switch (option) {
                    case 1:
                        menuCursos(arbolCursos);
                        break;
                    case 2:
                        menuGrupos(arbolCursos, listaInstructores);
                        break;
                    case 3:
                        menuEstudiantes(arbolCursos, listaEstudiantes);
                        break;
                    case 4:
                        consultarInstructores(listaInstructores);
                        break;
                    case 5:
                        consultarEstudiantes(listaEstudiantes);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.next(); 
                option = 0; 
            }
        } while (option != 6);
    }

    public static void menuCursos(TreeSet<Curso> arbolCursos) {
        Scanner teclado = new Scanner(System.in);
        Curso unCurso = null;
        int option = 0;

        do {
            int i = 0;
            String cursoBuscado = null;

            System.out.println("\n----------Menu Cursos----------");
            System.out.println("1. Agregar curso");
            System.out.println("2. Consultar cursos");
            System.out.println("3. Regresar al menú principal");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                teclado.nextLine();
                switch (option) {
                    case 1:
                        unCurso = new Curso();
                        unCurso.capturarDatos(); 
                        arbolCursos.add(unCurso);
                        break;
                    case 2:
                        if (arbolCursos.isEmpty()) {
                            System.out.println("No hay cursos registrados.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso que desea consultar: ");
                            cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.presentarDatos(); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.next(); 
                option = 0; 
            }
        } while (option != 3);
    }

    public static void menuGrupos(TreeSet<Curso> arbolCursos, ArrayList<Instructor> listaInstructores) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;

        do {
            int i = 0;
            String cursoBuscado = null;

            System.out.println("\n----------Menu Grupos----------");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Modificar grupo");
            System.out.println("3. Consultar grupos");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                teclado.nextLine();
                switch (option) {
                    case 1:
                        if (arbolCursos.isEmpty()) {
                            System.out.println("No hay cursos registrados para agregar grupos.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso del cual desea crear un grupo: ");
                            cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.agregarGrupo(listaInstructores); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 2:
                        if (arbolCursos.isEmpty()) {
                            System.out.println("No hay cursos registrados para modificar grupos.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso del cual desea modificar un grupo: ");
                            cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.modificarGrupo(listaInstructores);
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 3:
                        if (arbolCursos.isEmpty()) {
                            System.out.println("No hay cursos registrados para consultar grupos.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso del cual desea consultar el grupo: ");
                            cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.consultarGrupo(); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.next(); 
                option = 0; 
            }
        } while (option != 4);
    }

    public static void menuEstudiantes(TreeSet<Curso> arbolCursos, ArrayList<Estudiante> listaEstudiantes) {
        Scanner teclado = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n----------Menu Estudiantes----------");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Consultar estudiantes");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                teclado.nextLine();
                switch (option) {
                    case 1:
                        if (arbolCursos.isEmpty()) {
                            System.out.println("No hay cursos registrados para agregar estudiantes.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            int i = 0;
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso al cual desea agregar un estudiante: ");
                            String cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.agregarEstudiante(listaEstudiantes); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 2:
                        if (listaEstudiantes.isEmpty()) {
                            System.out.println("No hay estudiantes registrados para eliminar.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            int i = 0;
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso al cual desea eliminar un estudiante: ");
                            String cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.eliminarEstudiante(); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 3:
                        if (listaEstudiantes.isEmpty()) {
                            System.out.println("No hay estudiantes registrados.");
                        } else {
                            System.out.println("\n----------Cursos registrados----------");
                            int i = 0;
                            for (Curso tmp : arbolCursos) {
                                System.out.println((i + 1) +  ") ID: " + tmp.getIdCurso() + " Nombre: " + tmp.getNombreCurso() + " Duración: " + tmp.getDiasDuracion() + " días");
                                i++;
                            }
                            System.out.print("Escriba el ID del curso al cual desea consultar los estudiantes: ");
                            String cursoBuscado = teclado.nextLine();
                            for (Curso tmp : arbolCursos) {
                                if (tmp.getIdCurso().equals(cursoBuscado)) {
                                    tmp.consultarEstudiantes(); 
                                    option = 100;
                                    break;
                                }
                            }
                            if (option != 100) {
                                System.out.println("No se encontró el curso con ID: " + cursoBuscado);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Regresando al menú principal...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.next(); 
                option = 0; 
            }
        } while (option != 4);
    }

    public static void consultarInstructores(ArrayList<Instructor> listaInstructores) {
        if (listaInstructores.isEmpty()) {
            System.out.println("No hay instructores registrados.");
        } else {
            System.out.println("\n----------Instructores registrados----------");
            for (Instructor tmp : listaInstructores) {
                tmp.presentarDatos(); 
            }
        }
    }

    public static void consultarEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n----------Estudiantes registrados----------");
            for (Estudiante tmp : listaEstudiantes) {
                tmp.consultarEstudiantes(); 
            }
        }
    }
}