package com.Examen_4TP.Clases.HaltChecker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HaltCheckerContadorTest {

    @Test
    void analizarCodigo_withNoLoops_returnsFalse() {
        // Arrange
        HaltCheckerContador haltChecker = new HaltCheckerContador();
        List<String> tokens = Arrays.asList("int", "i", "=", "0", ";", "while", "(", "true", ")", "{", "i", "++;", "}");

        // Act
        boolean result = haltChecker.analizarCodigo(tokens);

        // Assert
        assertFalse(result);
    }

    @Test
    void analizarCodigo_withInfiniteWhileLoop_returnsTrue() {
        // Arrange
        HaltCheckerContador haltChecker = new HaltCheckerContador();
        List<String> tokens = Arrays.asList("while", "(", "true", ")", "{", "i", "++;", "}");

        // Act
        boolean result = haltChecker.analizarCodigo(tokens);

        // Assert
        assertTrue(result);
    }

    @Test
    void analizarCodigo_withInfiniteForLoop_returnsTrue() {
        // Arrange
        HaltCheckerContador haltChecker = new HaltCheckerContador();
        List<String> tokens = Arrays.asList("for", "(", "int", "i", "=", "0", ";", ";", ")", "{", "i", "++;", "}");

        // Act
        boolean result = haltChecker.analizarCodigo(tokens);

        // Assert
        assertTrue(result);
    }
}

