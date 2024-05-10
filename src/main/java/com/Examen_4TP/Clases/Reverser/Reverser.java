package com.Examen_4TP.Clases.Reverser;
public class Reverser {

    /**
     * Inicia un contador según el valor booleano recibido.
     * @param flag Si es true, inicia un contador hacia abajo hasta 0. Si es false, inicia un contador hacia arriba indefinidamente.
     * @return Retorna el valor booleano opuesto al recibido.
     */
    public boolean toggleAndCount(boolean flag) {
        if (flag) {
            // Inicia un contador hacia abajo que para en 0
            new Thread(() -> {
                for (int i = 10; i >= 0; i--) {
                    System.out.println("Contador decreciente: " + i);
                    try {
                        Thread.sleep(1000);  // Espera de 1 segundo entre cada número
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Contador interrumpido.");
                    }
                }
            }).start();
            return false;
        } else {
            // Inicia un contador que cuenta hasta infinito en intervalos de 1 segundo
            new Thread(() -> {
                int i = 0;
                while (true) {
                    System.out.println("Contador creciente: " + i++);
                    try {
                        Thread.sleep(1000);  // Espera de 1 segundo entre cada número
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Contador interrumpido.");
                        break;
                    }
                }
            }).start();
            return true;
        }
    }
}
