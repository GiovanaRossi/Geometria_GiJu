import java.util.Scanner;
 
public class GeomeEspacial extends Plana{
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
                AreaTotalPrisma(scanner);
                break;
        case 2:
                VolumePrisma(scanner);
                break;
        case 3:
                AreaTotalCilindr(scanner);
                break;
        case 4:
                VolumeCilindr(scanner);
                break;
        case 5:
                AreaTotalPiramide(scanner);
                break;
        case 6:
                VolumePiramide(scanner);
                break;
        case 7:
                AreaTotalCone(scanner);
                break;
        case 8:
                VolumeCone(scanner);
                break;
        case 9:
                AreaTotalTronco(scanner);
                break;
        case 10:
                VolumeTronco(scanner);
                break;
        case 11:
                AreaTotalEsfera(scanner);
                break;
        case 12:
                VolumeEsfera(scanner);
                break;
        default:
                System.out.println("Opção inválida.");
                break;
        }
       
        scanner.close();
    }
   
        // Prisma    
    private static void AreaTotalPrisma (Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_pr = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_pr = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c_pr= scanner.nextDouble();


        double area_pr = 2*a_pr*b_pr + 2*b_pr*c_pr + 2*a_pr*c_pr;
        System.out.println("A area Total do paralelepípedo: " + area_pr);
 
    }
 
    private static void VolumePrisma (Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_pr = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_pr = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c_pr = scanner.nextDouble();

        double area_pr = a_pr*b_pr*c_pr;
        System.out.println("A area Total do paralelepípedo: " + area_pr);   
       
   }
 
 
 
        // Cilindro
    private static void AreaTotalCilindr (Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_ci = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_ci = scanner.nextDouble();
 
        double area_ci = 2 * Math.PI * r_ci *(r_ci + h_ci);
        System.out.println("A area Total do Cilindro: " + area_ci);
       
    }
    private static void VolumeCilindr (Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_ci = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_ci = scanner.nextDouble();
 
        double v_ci =  Math.PI * Math.pow(r_ci, 2) * h_ci;
        System.out.println("A area Total do Cilindro: " + v_ci);
    }  
 
 
 
        // Pirâmide
     private static void AreaTotalPiramide (Scanner scanner) {
        System.out.print("Digite o valor da area da lateral: ");
        double al_pi = scanner.nextDouble();
        System.out.print("Digite o valor da area da base: ");
        double ab_pi = scanner.nextDouble();
 
        double area_pi = al_pi + ab_pi;
        System.out.println("A area Total da Pirâmide: " + area_pi);
    }  
       
     private static void VolumePiramide (Scanner scanner) {
        System.out.print("Digite o valor de h: ");
        double h_pi = scanner.nextDouble();
        System.out.print("Digite o valor da area da base: ");
        double ab_pi = scanner.nextDouble();
 
        double v_pi = ab_pi * h_pi/3;
        System.out.println("A area Total da Pirâmide: " + v_pi);
    }    
 
 
        // Cone
     private static void AreaTotalCone(Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_co = scanner.nextDouble();
        System.out.print("Digite o valor de g: ");
        double g_co = scanner.nextDouble();
 
        double ab_co =  Math.PI * Math.pow(r_co, 2);
        double al_co =  Math.PI * r_co * g_co;
        double area_co =  ab_co + al_co;
        System.out.println("A area Total do Cone: " + area_co);
    }  
   
     private static void VolumeCone (Scanner scanner) {
        System.out.print("Digite o valor de r: ");
        double r_co = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_co = scanner.nextDouble();
 
        double v_co =  Math.PI * Math.pow(r_co, 2) * h_co / 3;
        System.out.println("A Volume do Cone: " + v_co);
    }    
 
 
        //Tronco
     private static void AreaTotalTronco (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double rme_t = scanner.nextDouble();
        System.out.print("Digite o valor de R: ");
        double rma_t = scanner.nextDouble();
        System.out.print("Digite o valor de g: ");
        double g_t = scanner.nextDouble();
 
        double area_t = Math.PI * Math.pow(rme_t, 2) + Math.PI * Math.pow(rma_t, 2) + Math.PI * g_t * (rma_t+ rme_t);
        System.out.println("A area Total do Tronco do cone: " + area_t);
    }
     private static void VolumeTronco (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double rme_t = scanner.nextDouble();
        System.out.print("Digite o valor de R: ");
        double rma_t = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_t = scanner.nextDouble();
 
        double v_t =  Math.PI * h_t *(Math.pow(rme_t, 2) + rme_t* rma_t + Math.pow(rma_t, 2)) / 3;
        System.out.println("A Volume do Tronco do cone: " + v_t);
    }
 
 
        //Esfera
     private static void AreaTotalEsfera (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double r_es = scanner.nextDouble();
 
        double area_es =  4 * Math.PI * Math.pow(r_es, 2);
        System.out.println("A area Total do Esfera: " + area_es);
    }
     private static void VolumeEsfera (Scanner scanner){
        System.out.print("Digite o valor de r: ");
        double r_es = scanner.nextDouble();
 
        double v_es =  4/3 * Math.PI * Math.pow(r_es, 3);
        System.out.println("A Volume da Esfera: " + v_es);
    }
 
 
}