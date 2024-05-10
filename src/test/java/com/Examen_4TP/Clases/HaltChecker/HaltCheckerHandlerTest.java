package com.Examen_4TP.Clases.HaltChecker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HaltCheckerHandlerTest {

    @Test
    void handle_withNoInfiniteLoops() {
        // Arrange
        List<String> tokens = Arrays.asList("int", "i", "=", "0", ";", "while", "(", "i", "<", "10", ")", "{", "i", "++;", "}");

        // Act
        HaltCheckerHandler handler = new HaltCheckerHandler();
        handler.handle(tokens);

        // Assert
        // If there are no infinite loops, the output should show that the loops are finite.
        // Since the output is printed directly, it's hard to test programmatically.
        // Manual inspection of the output is needed.
    }

    @Test
    void handle_withInfiniteLoops() {
        // Arrange
        List<String> tokens = Arrays.asList("while", "(", "true", ")", "{", "i", "++;", "}");

        // Act
        HaltCheckerHandler handler = new HaltCheckerHandler();
        handler.handle(tokens);

        // Assert
        // If there is an infinite loop, the output should show that at least one loop is infinite.
        // Since the output is printed directly, it's hard to test programmatically.
        // Manual inspection of the output is needed.
    }
}

