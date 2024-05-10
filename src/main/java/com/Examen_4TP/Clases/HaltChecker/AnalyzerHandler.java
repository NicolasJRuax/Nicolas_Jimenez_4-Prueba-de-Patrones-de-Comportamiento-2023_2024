package com.Examen_4TP.Clases.HaltChecker;

import com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje.HaltCheckerLexico;
import com.Examen_4TP.Clases.HaltChecker.AnalisisDelLenguaje.HaltCheckerSintaxis;
import com.Examen_4TP.Clases.Reverser.Reverser;

import java.util.List;

public class AnalyzerHandler extends AbstractHandler {
    private HaltCheckerSintaxis haltSintaxis = new HaltCheckerSintaxis();
    private HaltCheckerLexico haltLexico = new HaltCheckerLexico();

    @Override
    public void handle(List<String> tokens) {
        if (haltSintaxis.analizarCodigo(tokens) && haltLexico.analizarCodigo(tokens)) {
            super.handle(tokens);
        } else {
            System.out.println("Syntax error detected. Stopping execution.");
        }
    }
}
