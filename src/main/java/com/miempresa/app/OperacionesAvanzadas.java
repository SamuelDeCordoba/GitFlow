package main.java.com.miempresa.app;

public class OperacionesAvanzadas {
	
	// Método para calcular la potencia de un número
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Método para calcular la raíz cuadrada de un número
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero);
    }

    // Método para calcular el módulo de dos números
    public static double modulo(double a, double b) {
        return a % b;
    }
}

