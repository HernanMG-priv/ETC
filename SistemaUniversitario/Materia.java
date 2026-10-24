package SistemaUniversitario;

public class Materia {
    private String clave;
    private String nombre;
    private int creditos;
    private int cuatrimestre;

    public Materia(String clave, String nombre, int creditos, int cuatrimestre) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
    }

    public String consultarInformacion() {
        return "Clave: " + clave +
               "\nMateria: " + nombre +
               "\nCreditos: " + creditos +
               "\nCuatrimestre: " + cuatrimestre;
    }

    public void consultarDocentes() {
        System.out.println("Consultando docentes que imparten: " + nombre);
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }
    
}
