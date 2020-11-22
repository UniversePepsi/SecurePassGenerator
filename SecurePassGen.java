// package POO;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class SecurePassGen { // Change name!
    public static String passGen(int numOfChar) {
        String allowedChars = "abcdefghijklmnñopqrstuvxyz0123456789";
        StringBuilder passGenerated = new StringBuilder();

        for (int i = 0; i < numOfChar; i++) {
            int randNum = new Random().nextInt(allowedChars.length());
            passGenerated.append(allowedChars.charAt(randNum));
        }

        return passGenerated.toString();
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numOfChar, numOfPasswords;

        System.out.println("[==========================================]" + "\n" + "[*]: Bienvenido al Generador de Contraseñas.");
        System.out.println("[*]: Autores: Pronoob & Pepsi." + "\n" + "[==========================================]" + "\n");
        System.out.print("[#]: Introduzca los caracteres de la contraseña (Max: 20): "); numOfChar = sc.nextInt();
        System.out.print("[#]: Introduzca contraseñas a generar: "); numOfPasswords = sc.nextInt();

        if (numOfChar > 20) {
            System.err.println("[*]: Son más de 20 carácteres, no esta permitido.");
            return;
        }

        System.out.println("\n" + "[*]: Has generado: " + numOfPasswords + " contraseñas." + "\n");
        for (int i = 0; i < numOfPasswords; i++) {
            System.out.println("[!] Contraseña " + (i+1) + ": " + passGen(numOfChar));
        }

        sc.close();
    }
}
