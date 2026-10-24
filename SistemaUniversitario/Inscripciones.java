package SistemaUniversitario;

import java.time.LocalDate;

public class Inscripciones {
    private int idInscripciones;
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;
    private Materia materia;

    public Inscripciones(int idInscripciones, Estudiante estudiante, Materia materia) {
        this.idInscripciones = idInscripciones;
        this.estudiante = estudiante;
        this.materia = materia;
        this.fecha = LocalDate.now();
        this.estado = "Pendiente";
    }

    public void registrado() {
        estado = "Activa";
        System.out.println("Inscripcion registrada correctamente.");
    }

    public void cancelado() {
        estado = "Cancelada";
        System.out.println("La inscripcion ha sido cancelada.");
    }

    public String consultarEstado() {
        return "Inscripcion: " + idInscripciones +
               "\nEstudiante: " + estudiante.getNombre() +
               "\nMateria: " + materia.getNombre() +
               "\nFecha: " + fecha +
               "\nEstado: " + estado;
    }
}
