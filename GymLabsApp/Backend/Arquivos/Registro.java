package GymLabsApp.Backend.Arquivos;
import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Novo Usuário:");
        System.out.print("Nome Completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Nome de Usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Generar una ID única (puedes usar un generador de ID, como UUID, en una aplicación real)
        String idUsuario = generateUniqueID();

        System.out.print("Altura (cm): ");
        double altura = scanner.nextDouble();

        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();

        // Cierra el Scanner cuando hayas terminado de usarlo
        scanner.close();

        // Aquí deberías guardar los datos en una base de datos (no implementado en este ejemplo)

        System.out.println("Registro exitoso. Su ID de usuario es: " + idUsuario);
        // Por ahora, simplemente imprimimos los datos para demostrar el registro exitoso
        System.out.println("Obrigado por se registrar, agora você faz parte de Gym Labs! Seja Bem-vindo.");
    }

    // Método ficticio para generar una ID única
    private static String generateUniqueID() {
        // Aquí puedes implementar la lógica para generar una ID única
        // Por ejemplo, usando UUID.randomUUID() en una aplicación real
        return "ID-12345";
    }
}
