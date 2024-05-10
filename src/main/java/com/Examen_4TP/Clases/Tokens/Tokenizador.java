package com.Examen_4TP.Clases.Tokens;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class Tokenizador {

    /**
     * Tokeniza el texto ingresado en palabras, espacios y signos de puntuación.
     *
     * @param text El texto a tokenizar.
     * @return Una lista de tokens.
     */
    public List<String> tokenize(String text) {
        List<String> tokens = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getWordInstance();
        iterator.setText(text);
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            // Incluimos los espacios y puntuación como tokens
            tokens.add(text.substring(start, end));
        }
        return tokens;
    }
}
