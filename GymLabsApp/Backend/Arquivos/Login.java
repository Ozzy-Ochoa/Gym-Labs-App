package GymLabsApp.Backend.Arquivos;

import java.util.Scanner;

public class Login {
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Iniciar Sessão:");
            System.out.print("Nome de Usuário ou Email: ");
            String usuarioOEmail = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            // Ahora puedes llamar al método validarCredenciales de Autenticacion
            boolean autenticado = Autenticacion.validarCredenciales(usuarioOEmail, senha);

            if (autenticado) {
                System.out.println("Login bem-sucedido. Bem-vindo!");
                // Coloca aquí la lógica para llevar al usuario a la pantalla principal de la aplicación
            } else {
                System.out.println("Falha na autenticação. Verifique as credenciais.");
            }
        } finally {
            // Cerrar el scanner para evitar la fuga de recursos
            scanner.close();
        }
    }

    // Resto del código ...

    public static void main(String[] args) {
        login();
    }
}
