package com.tearea1enero;



public class MainPersona {


    public static void main(String[] args) {
      
      //creamos la persona 1

        Persona persona1 = new Persona("Amaia", "González Ruiz", "Mujer", 24, 1.78);
        persona1.setNombre("Amaia");
        persona1.setApellidos("González Ruiz");
        persona1.setGenero("Mujer");
        persona1.setEdad(24);
        persona1.setAltura(1.72);
      
      //mostramos los atributos

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellidos: " + persona1.getApellidos());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Altura: " + persona1.getAltura());


    }
}
