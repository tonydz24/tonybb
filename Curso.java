import java.util.Scanner;
import java.util.TreeSet;

public class Curso {
    protected String idCurso;
    protected String nombreCurso;
    protected int diasDuracion;
    protected int cantidadGrupos;
    protected TreeSet<Grupo> grupos;

    public Curso() {
        this.idCurso = "Sin ID";
        this.nombreCurso = "Sin nombre";
        this.diasDuracion = 0;
        this.cantidadGrupos = 0;
        this.grupos = new TreeSet<>();
    }

    public Curso(String idCurso, String nombreCurso, int diasDuracion, int cantidadGrupos) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.diasDuracion = diasDuracion;
        this.cantidadGrupos = cantidadGrupos;
        this.grupos = new TreeSet<>();
    }

    public void capturarDatos() {
        Scanner teclado = new Scanner(System.in);
        String idCurso;
        System.out.print("Ingrese el nombre del curso: ");
        this.nombreCurso = teclado.nextLine();
        System.out.print("Ingrese la duración en días: ");
        this.diasDuracion = teclado.nextInt();
        System.out.print("Ingrese la cantidad de grupos: ");
        this.cantidadGrupos = teclado.nextInt();
        idCurso = this.nombreCurso.substring(0, 3).toUpperCase() + this.diasDuracion + this.nombreCurso.substring(this.nombreCurso.length() - 3).toUpperCase();
        this.idCurso = idCurso;
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

    public TreeSet<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(TreeSet<Grupo> grupos) {
        this.grupos = grupos;
    }
}
