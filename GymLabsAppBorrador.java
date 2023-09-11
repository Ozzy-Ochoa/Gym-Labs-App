import java.util.Scanner;

public class GymLabsAppBorrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindos a Gym Labs. Um aplicativo para Academia e Nutrição");

        System.out.println("Escolha uma opção:");
        System.out.println("1. Iniciar Sessão");
        System.out.println("2. Registrar-se");

        int opcionInicio = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente

        if (opcionInicio == 2) {
            realizarRegistro(scanner);
        } else if (opcionInicio != 1) {
            System.out.println("Opção inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        System.out.println("Iniciar Sessão");
        System.out.print("Nome de usuário ou Email: ");
        String usuarioOEmailInicio = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaInicio = scanner.nextLine();

        // Aquí deberías implementar la lógica de verificarCredenciales()
        if (verificarCredenciales(usuarioOEmailInicio, senhaInicio)) {
            System.out.println("Início de seção exitoso");

            // Mostrar menú de opciones para el usuario
            int opcion = 0;

            while (opcion != 5) {
                System.out.println("¿Qual opção quer selecionar?");
                System.out.println("1. Ver Wiki");
                System.out.println("2. Ver Meu Progresso");
                System.out.println("3. Ver Treinos");
                System.out.println("4. Ver Nutrição");
                System.out.println("5. Ver Configurações");
            
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Opção 1 Accesso a WIKI GYM LABS  
                        System.out.println("Selecionou a opção 1");
                        System.out.println("Bem-Vind@s à Wiki de Gym Labs.");
                        break;
                    case 2:
                        // Opção 2 Accesso a MEU PROGRESSO
                        System.out.println("Selecionou a opção 2");
                        System.out.println("Bem-Vind@s à Meu Progresso.");
                        break;
                    case 3:
                        // Opção 3 Accesso a TREINOS
                        System.out.println("Selecionou a opção 3");
                        System.out.println("Bem-Vind@s à Treinos");
                        break;
                    case 4:
                        // Opção 4 Accesso a NUTRIÇÃO
                        System.out.println("Selecionou a opção 4");
                        System.out.println("Bem-Vind@s à Nutrição");
                        break;
                    case 5:
                        // Opção 5 Accesso a CONFIGURAÇÕES
                        System.out.println("Selecionou a opção 5");
                        System.out.println("Bem-Vind@s às Configurações de Gym Labs");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }

            // Espacio de administración
            System.out.print("Ingressa o código de administrador: ");
            String adminCode = scanner.nextLine();
            
            // Verificar código de administrador
            if (verificarCodigoAdmin(adminCode)) {
                System.out.println("Bem-Vindo ao espaço de Administrador");
                // Mostrar opciones de administración
                MenuAdministrador();
            } else {
                System.out.println("Código de administrador incorreto. Acesso denegado.");
            }
        } else {
            System.out.println("Credenciais incorretas. Por favor, tente de novo.");
        }

        scanner.close();
    }

    private static void realizarRegistro(Scanner scanner) {
        System.out.println("Registro de novo usuario");

        System.out.print("Nome completo: ");
        String fullName = scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String birthDate = scanner.nextLine();

        System.out.print("Cadastrar Nome de usuário: ");
        String nomeUsuario = scanner.nextLine(); // Captura del nombre de usuario

        System.out.print("Email para registro: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        // Aquí puedes almacenar los datos de registro en una estructura de datos o base de datos
        // Por ahora, simplemente imprimimos los datos para demostrar el registro exitoso
        System.out.println("Obrigado por se registrar, agora você faz parte de Gym Labs! Seja Bem-vindo.");
    }

    private static boolean verificarCredenciales(String username, String password) {
        // Tu lógica de código aquí
        // Devuelve un valor booleano
        return true; // o false, dependiendo de tu lógica
    }

    private static boolean verificarCodigoAdmin(String adminCode) {
        // Lógica para verificar el código de administrador
        // Retorna true si el código es válido, false en caso contrario
        // Ejemplo:
        return adminCode.equals("12345");
    }

    private static void MenuAdministrador() {
        // Lógica para mostrar el menú de opciones para el administrador
        // Ejemplo:
        System.out.println("Menú de opções para o administrador:");
        System.out.println("1. Agregar Conteúdo á WIKI");
        System.out.println("2. Agregar plano de Treino");
        System.out.println("2. Agregar plano de Nutrição");
        System.out.println("6. Administrar usuarios");
        // ...
    }
}
