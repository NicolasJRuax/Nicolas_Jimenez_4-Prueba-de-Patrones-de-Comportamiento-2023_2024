package com.Examen_4TP.Clases;
import com.Examen_4TP.Clases.HaltChecker.AnalyzerHandler;
import com.Examen_4TP.Clases.HaltChecker.HaltCheckerHandler;
import com.Examen_4TP.Clases.HaltChecker.Handler;
import com.Examen_4TP.Clases.Tokens.Tokenizador;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos el tokenizer
        Tokenizador tokenizer = new Tokenizador();
        List<String> tokens = tokenizer.tokenize("int i = 0; while(true) { i++; }");

        // Configuramos la cadena de responsabilidad
        Handler syntaxAnalyzer = new AnalyzerHandler();
        Handler haltChecker = new HaltCheckerHandler();

        syntaxAnalyzer.setNext(haltChecker);

        // Empezamos el procesamiento
        syntaxAnalyzer.handle(tokens);
    }
}