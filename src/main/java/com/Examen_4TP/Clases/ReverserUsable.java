package com.Examen_4TP.Clases;

// Clase que proporciona el método execute para ejecutar el reverser.
public class ReverserUsable {

    // Método para ejecutar el reverser con el código proporcionado.
    public static void execute(String code) {
        // Llama a HaltChecker con el código proporcionado
        boolean esBucle = HaltChecker.check(code);

        // Si el código es un bucle, ejecuta un contador de 10 a 0, si no, ejecuta un bucle infinito
        if (esBucle) {
            int num = 10; // Inicializamos el contador en 10
            while (num > 0) { // Mientras el contador sea mayor que 0
                System.out.println(num); // Mostramos el contador
                num--; // Decrementamos el contador
            }
        } else {
            while (true) { // Bucle infinito
                System.out.println("Bucle infinito"); // Mostramos un mensaje
            }
        }
    }
}
