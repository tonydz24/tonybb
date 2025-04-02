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
                teclado.next(); 
                option = 0; 
            }
        } while (option != 1 && option != 2);

        if (option == 1) {
            System.out.println("Cargando datos predeterminados...");
            //Agregar datos predeterminados aquí
        }
        
        do {
            System.out.println("\n----------Menu Principal----------");
            System.out.println("1. Agregar y consultar cursos");
            System.out.println("2. Agregar, modificar y consultar grupos");
            System.out.println("3. Agregar, elminar y consultar estudiantes");
            System.out.println("4. Consultar instructores");
            System.out.println("5. Consltar estudiantes por grupo");
            System.out.println("6. Salir");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                switch (option) {
                    case 1:
                        menuCursos();
                        break;
                    case 2:
                        menuGrupos();
                        break;
                    case 3:
                        menuEstudiantes();
                        break;
                    case 4:
                        consultarInstructores();
                        break;
                    case 5:
                        consultarEstudiantesPorGrupo();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("]Opción inválida, por favor intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                teclado.next(); 
                option = 0; 
            }
        } while (option != 6);
    }

    public static void menuCursos() {
        Scanner teclado = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n----------Menu Cursos----------");
            System.out.println("1. Agregar curso");
            System.out.println("2. Consultar cursos");
            System.out.println("3. Regresar al menú principal");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                switch (option) {
                    case 1:
                        // Lógica para agregar curso
                        break;
                    case 2:
                        // Lógica para consultar cursos
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

    public static void menuGrupos() {
        Scanner teclado = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n----------Menu Grupos----------");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Modificar grupo");
            System.out.println("3. Consultar grupos");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Seleccione el número de la opción deseada: ");
            if (teclado.hasNextInt()) {
                option = teclado.nextInt();
                switch (option) {
                    case 1:
                        // Lógica para agregar grupo
                        break;
                    case 2:
                        // Lógica para modificar grupo
                        break;
                    case 3:
                        // Lógica para consultar grupos
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

    public static void menuEstudiantes() {
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
                switch (option) {
                    case 1:
                        // Lógica para agregar estudiante
                        break;
                    case 2:
                        // Lógica para eliminar estudiante
                        break;
                    case 3:
                        // Lógica para consultar estudiantes
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

    public static void consultarInstructores() {
        // Implementar la consulta de instructores
    }

    public static void consultarEstudiantesPorGrupo() {
        // Implementar la consulta de estudiantes por grupo
    }
}