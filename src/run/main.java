package run;

import java.util.Scanner;

public class main {

    public static String clasificar(String password) {

        if (password.length() < 8) {
            return "Insegura";
        }

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }

        if (tieneNumero && tieneMayuscula) {
            return "Fuerte";
        } else if (tieneNumero) {
            return "Moderada";
        } else {
            return "Insegura";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una contraseña: ");
        String password = scanner.nextLine();

        String resultado = clasificar(password);
        System.out.println("Clasificación: " + resultado);

        scanner.close();
    }
}

