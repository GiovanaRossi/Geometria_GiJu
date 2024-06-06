package Geometria;
import java.util.Scanner;
public class GeomeEspacial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Escolha da forma
        System.out.println("Escolha a forma Espacial:");
        System.out.println("1. Prisma");
        System.out.println("2. Cilindro");
        System.out.println("3. Pirâmide");
        System.out.println("4. Cone");
        System.out.println("5. Tronco Cone");
        System.out.println("6. Esfera");

        int Escolha = scanner.nextInt();

        switch (Escolha) {
        case 1:
                CalculoPrisma(scanner);
                break;
        case 2:
               CalculoCilindr(scanner);
                break;
        case 3:
                CalculoPiramide(scanner);
                break;
        case 4:
                CalculoCone(scanner);
                break;
        case 5:
                CalculoTronco(scanner);
                break;
        case 6:
                CalculoEsfera(scanner);
                break;
        default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
    // Prisma    
    private static void CalculoPrisma (Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_pr = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_pr = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c_pr= scanner.nextDouble();
        double area_pr = 2*a_pr*b_pr + 2*b_pr*c_pr + 2*a_pr*c_pr;
        System.out.println("A area Total do paralelepípedo: " + area_pr);
        double vo_pr = a_pr*b_pr*c_pr;
        System.out.println("A Volume Total do paralelepípedo: " + area_pr);   
    }
 
    // Cilindro
    private static void CalculoCilindr (Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_ci = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_ci = scanner.nextDouble();
        double area_ci = 2 * Math.PI * r_ci *(r_ci + h_ci);
        System.out.println("A area Total do Cilindro: " + area_ci);
        double v_ci =  Math.PI * Math.pow(r_ci, 2) * h_ci;
        System.out.println("A Volume Total do Cilindro: " + v_ci);
    }

    // Pirâmide
    private static void CalculoPiramide (Scanner scanner) {
        System.out.print("Digite o valor da area da lateral: ");
        double al_pi = scanner.nextDouble();
        System.out.print("Digite o valor da area da base: ");
        double ab_pi = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_pi = scanner.nextDouble();
        double area_pi = al_pi + ab_pi;
        System.out.println("A area Total da Pirâmide: " + area_pi);
        double v_pi = ab_pi * h_pi/3;
        System.out.println("A Volume Total da Pirâmide: " + v_pi);
    }  

    // Cone
    private static void CalculoCone(Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_co = scanner.nextDouble();
        System.out.print("Digite o valor de g: ");
        double g_co = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_co = scanner.nextDouble();
        double ab_co =  Math.PI * Math.pow(r_co, 2);
        double al_co =  Math.PI * r_co * g_co;
        double area_co =  ab_co + al_co;
        System.out.println("A area Total do Cone: " + area_co);
        double v_co =  Math.PI * Math.pow(r_co, 2) * h_co / 3;
        System.out.println("A Volume do Cone: " + v_co);
    } 
    
    //Tronco
    private static void CalculoTronco (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double rme_t = scanner.nextDouble();
        System.out.print("Digite o valor de R: ");
        double rma_t = scanner.nextDouble();
        System.out.print("Digite o valor de g: ");
        double g_t = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_t = scanner.nextDouble();
        double area_t = Math.PI * Math.pow(rme_t, 2) + Math.PI * Math.pow(rma_t, 2) + Math.PI * g_t * (rma_t+ rme_t);
        System.out.println("A area Total do Tronco do cone: " + area_t);
        double v_t =  Math.PI * h_t *(Math.pow(rme_t, 2) + rme_t* rma_t + Math.pow(rma_t, 2)) / 3;
        System.out.println("A Volume do Tronco do cone: " + v_t);
    }

    //Esfera
    private static void CalculoEsfera (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double r_es = scanner.nextDouble();
        double area_es =  4 * Math.PI * Math.pow(r_es, 2);
        System.out.println("A area Total do Esfera: " + area_es);
        double v_es =  4/3 * Math.PI * Math.pow(r_es, 3);
        System.out.println("A Volume da Esfera: " + v_es);
    }
}