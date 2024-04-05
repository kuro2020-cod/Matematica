import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa un número binario de 16 dígitos (solo 0 y 1):");

        String input = scanner.nextLine();

        // Verificar que el número tenga exactamente 16 dígitos y solo contenga 0 y 1
        if (input.length() == 16 && input.matches("[01]+")) {
            // Convertir el número binario a decimal
            int decimal = Integer.parseInt(input, 2);
            System.out.println("Número binario en decimal: " + decimal);

            // Convertir el número binario a octal
            String octal = Integer.toOctalString(decimal);
            System.out.println("Número binario en octal: " + octal);

            // Convertir el número binario a hexadecimal
            String hex = Integer.toHexString(decimal);
            System.out.println("Número binario en hexadecimal: " + hex);
        } else {
            System.out.println("Por favor, ingresa un número binario válido de 16 dígitos (solo 0 y 1).");
        }
    }
}