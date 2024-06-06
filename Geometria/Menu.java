package Geometria;
import java.util.Scanner;

public class Menu{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        
        // Loop principal do menu
        while (true) {
            System.out.println("Seja bem vindo, selecione o que deseja calcular: ");
            System.out.println("1. Geometria Plana.");
            System.out.println("2. Geometria Espacial.");
            System.out.println("3. Sair.");
        
            escolha = scanner.nextInt();
            scanner.nextLine();

            // Verifica a escolha do usuário
            switch (escolha) {
                case 1:
                    Plana plana = new Plana();
                    System.out.println("Opção selecionada: Geometria Plana.");
                    
                    break;
                case 2:
                    GeomeEspacial Gespacial = new GeomeEspacial();
                    System.out.println("Opção selecionada: Geometria Espacial.");
                    break;
                case 3:
                // Encerra o programa
                    System.out.println("Saindo do programa...");    
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        }
    }
}