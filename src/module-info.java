import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada de dos n�meros enteros
        System.out.print("Introduce el primer n�mero (>= 2 y <= 20000): ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo n�mero (>= 2 y <= 20000): ");
        int num2 = scanner.nextInt();

        // Asegurar que los n�meros est�n dentro del rango permitido
        if (num1 < 2 || num1 > 20000 || num2 < 2 || num2 > 20000) {
            System.out.println("Los n�meros deben estar entre 2 y 20000.");
            return;
        }

        // Determinar los l�mites del intervalo
        int lowerBound = Math.min(num1, num2);
        int upperBound = Math.max(num1, num2);

        // Encontrar y contar los n�meros primos en el rango
        int count = contarPrimosEnRango(lowerBound, upperBound);

        // Mostrar el resultado
        System.out.println("Hay " + count + " n�meros primos entre " + lowerBound + " y " + upperBound + ".");
    }

    public static int contarPrimosEnRango(int lowerBound, int upperBound) {
        int count = 0;
        for (int num = lowerBound; num <= upperBound; num++) {
            if (esPrimo(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true; // 2 es el �nico n�mero par primo
        if (num % 2 == 0) return false;

        // Verificar divisibilidad hasta la ra�z cuadrada del n�mero
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

