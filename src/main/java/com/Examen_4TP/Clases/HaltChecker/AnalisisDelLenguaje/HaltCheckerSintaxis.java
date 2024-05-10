package com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje;

import com.Examen_4TP.Clases.HaltChecker.HaltChecker;

import java.util.List;
import java.util.Arrays;

    public class HaltCheckerSintaxis extends HaltChecker {

        /**
         * Analiza sintácticamente una lista de tokens de Java.
         * @param tokens Lista de tokens para analizar.
         */
        @Override
        public boolean analizarCodigo(List<String> tokens) {
            try {
                for (int i = 0; i < tokens.size(); i++) {
                    String token = tokens.get(i);
                    // Analizar diferentes estructuras de control y declaraciones
                    switch (token) {
                        case "if":
                            i = analyzeIfStatement(tokens, i);
                            break;
                        case "while":
                            i = analyzeWhileLoop(tokens, i);
                            break;
                        case "for":
                            i = analyzeForLoop(tokens, i);
                            break;
                    }
                }
            } catch (SyntaxException e) {
                System.out.println(e.getMessage());
                return false;
            }
            return true;
        }

        private int analyzeIfStatement(List<String> tokens, int startIndex) throws SyntaxException {
            int i = startIndex + 1;
            if (!tokens.get(i++).equals("(")) {
                throw new SyntaxException("Se esperaba '(' después de 'if'");
            }

            // Supongamos que es una condición simple
            String condition = tokens.get(i++);
            if (!condition.matches("true|false|[a-zA-Z_$][a-zA-Z\\d_$]*")) {
                throw new SyntaxException("Condición inválida: " + condition);
            }

            if (!tokens.get(i++).equals(")")) {
                throw new SyntaxException("Se esperaba ')' después de la condición");
            }

            if (!tokens.get(i++).equals("{")) {
                throw new SyntaxException("Se esperaba '{' para iniciar el bloque de 'if'");
            }

            // Asumimos que el bloque termina correctamente con }
            while (!tokens.get(i).equals("}")) {
                i++;
            }
            i++; // Pasar el }

            return i - 1;
        }

        private int analyzeWhileLoop(List<String> tokens, int startIndex) throws SyntaxException {
            int i = startIndex + 1;
            if (!tokens.get(i++).equals("(")) {
                throw new SyntaxException("Se esperaba '(' después de 'while'");
            }

            // Supongamos que es una condición simple
            String condition = tokens.get(i++);
            if (!condition.matches("true|false|[a-zA-Z_$][a-zA-Z\\d_$]*")) {
                throw new SyntaxException("Condición inválida: " + condition);
            }

            if (!tokens.get(i++).equals(")")) {
                throw new SyntaxException("Se esperaba ')' después de la condición");
            }
            return i - 1;
        }

        private int analyzeForLoop(List<String> tokens, int startIndex) throws SyntaxException {
            int i = startIndex + 1;
            if (!tokens.get(i++).equals("(")) {
                throw new SyntaxException("Se esperaba '(' después de 'for'");
            }

            // Analizar condición
            String condition = tokens.get(i++);
            if (!condition.matches("true|false|[a-zA-Z_$][a-zA-Z\\d_$]*") && !condition.equals(";")) {
                throw new SyntaxException("Condición inválida: " + condition);
            }

            // Asumir un ';' después de la condición
            if (!tokens.get(i++).equals(";")) {
                throw new SyntaxException("Se esperaba ';' después de la condición");
            }

            // Analizar incremento, simplemente verificaremos la existencia
            String increment = tokens.get(i++);
            if (!increment.matches("[a-zA-Z_$][a-zA-Z\\d_$]*\\+\\+|--")) {
                throw new SyntaxException("Expresión de incremento inválida: " + increment);
            }

            if (!tokens.get(i++).equals(")")) {
                throw new SyntaxException("Se esperaba ')' al final de la cláusula 'for'");
            }

            if (!tokens.get(i++).equals("{")) {
                throw new SyntaxException("Se esperaba '{' para iniciar el bloque de 'for'");
            }

            // Asumimos que el bloque termina correctamente con }
            while (!tokens.get(i).equals("}")) {
                i++;
            }
            i++; // Pasar el }

            return i - 1;
        }
        class SyntaxException extends Exception {
            public SyntaxException(String message) {
                super(message);
            }
        }
    }

