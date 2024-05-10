https://github.com/NicolasJRuax/Nicolas_Jimenez_4-Prueba-de-Patrones-de-Comportamiento-2023_2024.git

# Proyecto de Examen 4TP

Este proyecto contiene un sistema para analizar código fuente y verificar la presencia de bucles infinitos. El sistema utiliza una cadena de responsabilidad para analizar sintaxis y verificar bucles.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `com.Examen_4TP.Clases.HaltChecker`: Contiene las clases relacionadas con la verificación de bucles infinitos.
- `com.Examen_4TP.Clases.Reverser`: Contiene la clase `Reverser` que inicia contadores hacia arriba o hacia abajo.
- `com.Examen_4TP.Clases.Tokens`: Contiene la clase `Tokenizador` que tokeniza el código fuente.
- `com.Examen_4TP.Clases`: Contiene la clase `Main` que inicia el procesamiento.

## Casos de Uso

El sistema tiene los siguientes casos de uso:

- **Tokenizar Código**: El usuario puede tokenizar el código fuente.
- **Analizar Sintaxis**: El usuario puede analizar la sintaxis del código fuente.
- **Verificar Bucles Infinitos**: El usuario puede verificar la presencia de bucles infinitos en el código fuente.
- **Reverser**

## Pruebas

Se han creado pruebas unitarias para las clases `HaltCheckerContador` y `HaltCheckerHandler`. Estas pruebas verifican diferentes escenarios de análisis de bucles:

- Pruebas para `HaltCheckerContador`:
  - Verifica que el método `analizarCodigo` devuelve `false` cuando no hay bucles infinitos.
  - Verifica que el método `analizarCodigo` devuelve `true` cuando hay un bucle `while` infinito.
  - Verifica que el método `analizarCodigo` devuelve `true` cuando hay un bucle `for` infinito.

- Pruebas para `HaltCheckerHandler`:
  - Verifica que el método `handle` imprime que los bucles son finitos cuando no hay bucles infinitos.
  - Verifica que el método `handle` imprime que al menos un bucle es infinito cuando hay bucles infinitos.

 
