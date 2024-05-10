package com.Examen_4TP.Clases.HaltChecker;

import java.util.List;

public abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(List<String> tokens) {
        if (nextHandler != null) {
            nextHandler.handle(tokens);
        }
    }
}
