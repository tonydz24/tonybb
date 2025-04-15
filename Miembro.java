import java.util.Scanner;

public class Miembro {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Miembro() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.genero = "Sin genero";
    }

    public Miembro(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void capturarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        this.edad = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el género: ");
        this.genero = teclado.nextLine();
    }

    public void modificarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nuevo nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Ingrese la nueva edad: ");
        this.edad = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el nuevo género: ");
        this.genero = teclado.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}