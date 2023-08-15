# Codigo:

```Java
  
  /**
 * Começo do Software "Gym Labs"
 */
import java.util.Scanner;
public class GymLabsApp {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
                 // Login de usuario       
                  System.out.println("Bem-vindos a Gym Labs. Um aplicativo para Academia e Nutrição");       
                  System.out.print("Ingressa teu nome de usuário: ");        
                  String username = scanner.nextLine();        
                  System.out.print("Ingressa tua Senha: ");        
                  String password = scanner.nextLine();
                      // Verificar credenciales de usuario        
                          if (verificarCredenciales(username, password)) 
                          { 
                          System.out.println("Início de seção exitoso");            
                          // Mostrar menú de opciones para el usuario            
                          mostrarMenuUsuario();        
                          } else {            
                          System.out.println("Credenciais incorretas. Por favor, tente de novo.");        
                          }

                    int opcion = 0;

         while (opcion != 5) {
            System.out.println("¿Qual opção quer selecionar?");
            System.out.println("1. Wiki");
            System.out.println("2. Meu Progresso");
            System.out.println("3. Treinos");
            System.out.println("4. Nutrição");
            System.out.println("5. Configurações");
            
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
                                         if (verificarCodigoAdmin(adminCode)) 
                                         {
                                                     System.out.println("Bem-Vindo ao espaço de Administrador");            
                                                     // Mostrar opciones de administración            
                                                     mostrarMenuAdministrador();        
                                                     } else {            
                                                     System.out.println("Código de administrador incorreto. Acesso denegado.");        
                                                    }
                                                             scanner.close();    
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
                                                                          private static void mostrarMenuUsuario() {        
                                                                          // Lógica para mostrar el menú de opciones para el usuario        
                                                                          // Ejemplo:        
                                                                          System.out.println("Menú de opções para o usuário:");        
                                                                          System.out.println("1. Ver rotinas de exercício");        
                                                                          System.out.println("2. Ver planos de nutrição");        
                                                                          System.out.println("3. Ver progresso");        
                                                                          // ...    
                                                                          }
                                                                              private static void mostrarMenuAdministrador() {        
                                                                              // Lógica para mostrar el menú de opciones para el administrador        
                                                                              // Ejemplo:        
                                                                              System.out.println("Menú de opções para o administrador:");        
                                                                              System.out.println("1. Agregar rotina de exercício");        
                                                                              System.out.println("2. Agregar plano de nutrição");        
                                                                              System.out.println("3. Administrar usuarios");        
                                                                              // ...    
                                                                              }
                                                                              }

```
