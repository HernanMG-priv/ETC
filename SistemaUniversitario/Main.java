package SistemaUniversitario;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("20261001","Hernan Mendoza","hernan@universidad.edu.mx");

        Materia materia1 = new Materia("POO101","Programacion Orientada a Objetos",6,3);

        System.out.println("=== DATOS DEL ESTUDIANTE ===");
        System.out.println(estudiante1.consultarDatos());

        System.out.println("\n=== INFORMACION DE LA MATERIA ===");
        System.out.println(materia1.consultarInformacion());

        Inscripciones inscripcion1 = new Inscripciones(
            1,
            estudiante1,
            materia1
        );

        System.out.println("\n=== REGISTRO DE INSCRIPCION ===");
        inscripcion1.registrado();
        System.out.println(inscripcion1.consultarEstado());

        System.out.println("\n=== CANCELACION DE INSCRIPCION ===");
        inscripcion1.cancelado();
        System.out.println(inscripcion1.consultarEstado());
    }
        
        
}