import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada de dos números enteros
        System.out.print("Introduce el primer número (>= 2 y <= 20000): ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número (>= 2 y <= 20000): ");
        int num2 = scanner.nextInt();

        // Asegurar que los números están dentro del rango permitido
        if (num1 < 2 || num1 > 20000 || num2 < 2 || num2 > 20000) {
            System.out.println("Los números deben estar entre 2 y 20000.");
            return;
        }

        // Determinar los límites del intervalo
        int lowerBound = Math.min(num1, num2);
        int upperBound = Math.max(num1, num2);

        // Encontrar y contar los números primos en el rango
        int count = contarPrimosEnRango(lowerBound, upperBound);

        // Mostrar el resultado
        System.out.println("Hay " + count + " números primos entre " + lowerBound + " y " + upperBound + ".");
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
        if (num == 2) return true; // 2 es el único número par primo
        if (num % 2 == 0) return false;

        // Verificar divisibilidad hasta la raíz cuadrada del número
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

