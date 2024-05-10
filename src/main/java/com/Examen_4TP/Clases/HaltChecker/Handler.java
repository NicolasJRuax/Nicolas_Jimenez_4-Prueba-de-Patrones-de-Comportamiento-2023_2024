package com.Examen_4TP.Clases.HaltChecker;

import java.util.List;

public interface Handler {
    void setNext(Handler handler);
    void handle(List<String> tokens);
}
