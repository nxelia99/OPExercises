package com.tearea1enero;



public class MainPersona {


    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Amaia");
        persona1.setApellidos("González Ruiz");
        persona1.setGenero("Mujer");
        persona1.setEdad(24);
        persona1.setAltura(1.72);

        System.out.println("\nDatos de persona1: ");
        System.out.println("\nNombre: " + persona1.getNombre());
        System.out.println("Apellidos: " + persona1.getApellidos());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Altura: " + persona1.getAltura());

        // creación de profesor1
        Profesor profesor1 = new Profesor("Alejandro", "Ruiz Delgado", "Hombre", 35, 1.78, "Literatura", 12834);
        System.out.println("\nDatos de profesor1: ");
        System.out.println("\nNombre: " + profesor1.getNombre());
        System.out.println("Apellidos: " + profesor1.getApellidos());
        System.out.println("Género: " + profesor1.getGenero());
        System.out.println("Edad: " + profesor1.getEdad());
        System.out.println("Altura: " + profesor1.getAltura());
        System.out.println("Departamento: " + profesor1.getDepartamento());
        System.out.println("Id de licencia: " + profesor1.getIdlicencia());

        Profesor profesor2 = new Profesor("Miriam", "De la Rosa Vélez", "Mujer", 28, 1.67, "Tecnología", 11502);
        System.out.println("\nDatos de profesor2: ");
        System.out.println("\nNombre: " + profesor2.getNombre());
        System.out.println("Apellidos: " + profesor2.getApellidos());
        System.out.println("Género: " + profesor2.getGenero());
        System.out.println("Edad: " + profesor2.getEdad());
        System.out.println("Altura: " + profesor2.getAltura());
        System.out.println("Departamento: " + profesor2.getDepartamento());
        System.out.println("Id de licencia: " + profesor2.getIdlicencia());
    }
}
