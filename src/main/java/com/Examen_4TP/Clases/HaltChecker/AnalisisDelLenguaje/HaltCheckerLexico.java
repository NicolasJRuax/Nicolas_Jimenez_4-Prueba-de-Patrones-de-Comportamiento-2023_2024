package com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje;

import com.Examen_4TP.Clases.HaltChecker.HaltChecker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HaltCheckerLexico extends HaltChecker {

    private static final Set<String> keywords = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
            "for", "if", "goto", "implements", "import", "instanceof", "int", "interface", "long", "native",
            "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"
    ));

    private static final Set<String> operatorsAndSeparators = new HashSet<>(Arrays.asList(
            "+", "-", "*", "/", "=", ">", "<", "!", "&", "|", "^", "%", ":", "?",
            "(", ")", "{", "}", "[", "]", ";", ",", ".", " "
    ));

    /**
     * Analiza una lista de tokens para verificar si son válidos según las reglas léxicas de Java.
     * @param tokens La lista de tokens a analizar.
     */
    @Override
    public boolean analizarCodigo(List<String> tokens) {
        for (String token : tokens) {
            if (isValidToken(token)) {
                System.out.println("Token válido: '" + token + "'");
            } else {
                System.out.println("Token inválido: '" + token + "'");
                return false;
            }
        }
        return true;
    }

    /**
     * Determina si un token es válido o no.
     * @param token El token a validar.
     * @return true si el token es válido, false en caso contrario.
     */
    private boolean isValidToken(String token) {
        if (keywords.contains(token) || operatorsAndSeparators.contains(token) || isValidIdentifier(token) || isNumeric(token)) {
            return true;
        } else {
            System.out.println("Nombre de variable:" + token);
        }
        return false;
    }

    /**
     * Verifica si un token es un identificador válido en Java.
     * @param token El token a verificar.
     * @return true si es un identificador válido, false en caso contrario.
     */
    private boolean isValidIdentifier(String token) {
        return token.matches("^[a-zA-Z_$][a-zA-Z\\d_$]*$");
    }

    /**
     * Verifica si un token es un literal numérico.
     * @param token El token a verificar.
     * @return true si es un literal numérico, false en caso contrario.
     */
    private boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
