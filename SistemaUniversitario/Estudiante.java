package SistemaUniversitario;

public class Estudiante {

    private String matricula;
    private String nombre;
    private String correo;

    public Estudiante(String matricula, String nombre, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String consultarDatos() {
        return "Matricula: " + matricula +
               "\nNombre: " + nombre +
               "\nCorreo: " + correo;
    }

    public void revisarInscripciones() {
        System.out.println("Consultando inscripciones del estudiante: " + nombre);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }
}