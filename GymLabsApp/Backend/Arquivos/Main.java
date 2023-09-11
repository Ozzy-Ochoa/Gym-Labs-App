package GymLabsApp.Backend.Arquivos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bem-vindos a Gym Labs. Um aplicativo para Academia e Nutrição");
            System.out.println("Escolha:");
            System.out.println("1. Fazer Login");
            System.out.println("2. Registrar-se");
            System.out.print("Escolha a opção (1/2): ");

            int escolha = scanner.nextInt();

            if (escolha == 1) {
                // Llamar al archivo "Login.java" para hacer login
                Login.login(); // Suponiendo que hay una clase Login con un método estático login()
            } else if (escolha == 2) {
                // Llamar al archivo "Registro.java" para registrarse
                Registro.main(null); // Suponiendo que hay una clase Registro con un método estático registro()
            } else {
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }
}
