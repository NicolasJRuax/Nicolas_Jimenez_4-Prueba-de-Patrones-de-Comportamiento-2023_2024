package com.Examen_4TP.Clases.HaltChecker;

// Clase que contiene un método para verificar si un programa se ejecutará en un bucle infinito.
public class HaltChecker {
    // Verifica si el código dado puede terminar o si se ejecutará en un bucle infinito.
    public static boolean check(String code) {
        // Verificamos si el código contiene los caracteres <, > o la palabra clave break
        if (code.contains("<") || code.contains(">") || code.contains("break")) {
            return false; // Si contiene alguno de estos, el programa terminará
        } else {
            return true; // Si no contiene ninguno de estos, el programa es un bucle infinito
        }
    }
}

