package com.Examen_4TP.Clases.HaltChecker;

import java.util.List;

// Asumimos que existe una clase HaltChecker que necesitamos extender.
public class HaltCheckerContador extends HaltChecker {

    /**
     * Analiza una lista de tokens para determinar si contiene bucles infinitos.
     * @param tokens Lista de tokens que representan un fragmento de código.
     * @return true si se detecta un bucle infinito, false en caso contrario.
     */
    @Override
    public boolean analizarCodigo(List<String> tokens) {
        boolean isLoopInfinite = false;
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            switch (token) {
                case "while":
                    isLoopInfinite = analyzeWhile(tokens, i);
                    break;
                case "for":
                    isLoopInfinite = analyzeFor(tokens, i);
                    break;
                case "if":
                    isLoopInfinite = analyzeIf(tokens, i); // Aunque if no es un bucle, incluímos análisis por consistencia
                    break;
            }
            if (isLoopInfinite) {
                System.out.println("Se encontró un bucle infinito en: " + token);
                return true; // Retorna inmediatamente si encuentra un bucle infinito
            }
        }
        System.out.println("No se encontraron bucles infinitos.");
        return false;
    }

    private boolean analyzeWhile(List<String> tokens, int startIndex) {
        // Aquí va el análisis simplificado de un bucle while.
        for (int i = 0; i < tokens.size(); i++) {
            if (tokens.get(i).equals("true")) {
                return true;
            }
        }
        return false;
    }

    private boolean analyzeFor(List<String> tokens, int startIndex) {
        // Aquí va el análisis simplificado de un bucle for.
        int i = startIndex + 1;
        String condition = tokens.get(i + 3); // Supongamos que es la condición del bucle.
        if (condition.isEmpty() || condition.equals(";")) {
            return true; // Consideramos un for sin condición de parada como infinito.
        }
        return false;
    }

    private boolean analyzeIf(List<String> tokens, int startIndex) {
        // Si bien if no es un bucle, podemos verificar si incluye lógica que siempre se ejecuta.
        return false; // No consideramos if como un bucle.
    }
}
