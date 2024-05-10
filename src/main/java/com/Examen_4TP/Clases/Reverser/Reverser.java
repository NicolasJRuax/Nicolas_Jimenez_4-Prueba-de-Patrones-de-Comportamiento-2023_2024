package com.Examen_4TP.Clases.Reverser;

import com.Examen_4TP.Clases.HaltChecker.HaltChecker;

// Clase que ejecuta la comprobación y reversión del programa que se detiene o no se detiene.
public class Reverser {
    // Método principal que verifica si un programa se detiene o no y ejecuta un programa alternativo.
    public static void main(String[] args) {

        // Código del programa que se detiene
        String programaQueSeDetiene = "public class ProgramaQueSeDetiene {\n" +
                "    public static void main(String[] args) {\n" +
                "        int num = 10;\n" +
                "        while (num > 0) {\n" +
                "            System.out.println(num);\n" +
                "            num--;\n" +
                "        }\n" +
                "    }\n" +
                "}\n";

        // Código del programa que no se detiene
        String programaQueNoSeDetiene = "public class ProgramaQueNoSeDetiene {\n" +
                "    public static void main(String[] args) {\n" +
                "        while (true) {\n" +
                "            int num = 1;\n" +
                "            while (true) {\n" +
                "                System.out.println(num);\n" +
                "                num++;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n";

        String codigoReverser = "boolean esBucleProgramaDetiene = HaltChecker.check(programaQueNoSeDetiene);\n" +
                "\n" +
                "if (esBucleProgramaDetiene) {\n" +
                "    int num = 10; // Inicializamos el contador en 10\n" +
                "    while (num > 0) { // Mientras el contador sea mayor que 0\n" +
                "        System.out.println(num); // Mostramos el contador\n" +
                "        num--; // Decrementamos el contador\n" +
                "    }\n" +
                "} else {\n" +
                "    int num = 1; // Inicializamos el contador en 1\n" +
                "    while (true) { // Bucle infinito\n" +
                "        System.out.println(num); // Mostramos el contador\n" +
                "        num++; // Incrementamos el contador\n" +
                "    }\n" +
                "}";

        // Verifica si el programa que se detiene es un bucle infinito
        boolean esBucleProgramaDetiene = HaltChecker.check(programaQueNoSeDetiene);

        // Si el programa que se detiene es un bucle, ponemos un break, si no, un bucle infinito
        if (esBucleProgramaDetiene) {
            int num = 10; // Inicializamos el contador en 10
            while (num > 0) { // Mientras el contador sea mayor que 0
                System.out.println(num); // Mostramos el contador
                num--; // Decrementamos el contador
            }
        } else {
            int num = 1; // Inicializamos el contador en 1
            while (true) { // Bucle infinito
                System.out.println(num); // Mostramos el contador
                num++; // Incrementamos el contador
            }
        }
    }
}
