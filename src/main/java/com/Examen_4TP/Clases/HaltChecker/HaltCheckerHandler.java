package com.Examen_4TP.Clases.HaltChecker;

import com.Examen_4TP.Clases.Reverser.Reverser;
import java.util.List;

public class HaltCheckerHandler extends AbstractHandler {
    private HaltCheckerContador haltChecker = new HaltCheckerContador();
    private Reverser reverser = new Reverser();

    @Override
    public void handle(List<String> tokens) {
        boolean isLoopInfinite = haltChecker.analizarCodigo(tokens);
        reverser.toggleAndCount(isLoopInfinite);
        System.out.println("El bucle es infinito (haltChecker): " + isLoopInfinite);
        System.out.println("El bucle es infinito (reverser): " + !isLoopInfinite);
    }
}
