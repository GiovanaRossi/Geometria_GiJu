import java.util.Scanner;

public class Menu extends Geometria{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a geometria desejada: ");
        System.out.println("1. Geometria Espacial");
        System.out.println("2. Geometria Plana");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                Plana(scanner);
                break;
            case 2:
                GeomeEspacial(scanner);
                break;
            default:
                System.out.println("A opção escolhida está inválida. Por favor, escolha outra opção!");
                break;   
            }     
    }

}

// O SCANNER NÃO PODE PARAR DE RODAR O MENU!!