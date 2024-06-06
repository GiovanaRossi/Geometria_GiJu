package Geometria;
import java.util.Scanner;
public class Plana{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// Escolha da forma

    System.out.println("Escolha a forma plana:");
    System.out.println("1. Trapezio");
    System.out.println("2. Paralelogramo");
    System.out.println("3. Retangulo");
    System.out.println("4. Quadrado");
	System.out.println("5. Losango");
	System.out.println("6. Triangulo");
	System.out.println("7. Triangulo Equilatero");        
	System.out.println("8. Circunferencia");

	int opcao = scanner.nextInt();
      
    switch (opcao){
    case 1:
        calcularAreaTrap(scanner);
        break;
    case 2:
        calcularAreaPara(scanner);
        break;
    case 3:
        calcularAreaRet(scanner);
        break;
    case 4:
        calcularAreaQua(scanner);
        break;
	case 5:
        calcularAreaLos(scanner);
        break;
    case 6:
        calcularAreaTri(scanner);
        break;
	case 7:
        calcularAreaTriEq(scanner);
        break;
	case 8:
        calcularAreaCir(scanner);
        break;
	default:
        System.out.println("A opção escolhida está inválida. Por favor, escolha outra opção.");
        break;
    }
    scanner.close();
}

    // TRAPEZIO    
    private static void calcularAreaTrap(Scanner scanner) {
        System.out.print("Digite o valor de b: ");
        double b_tr = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B_tr = scanner.nextDouble();
        System.out.print("Digite o valor de d: ");
        double d_tr = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c_tr = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_tr = scanner.nextDouble();

        double area_tr = (h_tr * (b_tr + B_tr))/ 2;
        System.out.println("A area do trapezio: " + area_tr);
        double perimetro_tr = c_tr + b_tr + d_tr + B_tr;
        System.out.println("O perimetro do trapezio: " + perimetro_tr);
    }
    // PARALELOGRAMO
     private static void calcularAreaPara(Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_pa = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_pa = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_pa = scanner.nextDouble();

        double area_pa = a_pa * h_pa; 
        System.out.println("A area do paralelogramo: " + area_pa);
        double perimetro_pa =(2 * a_pa) + (2 * b_pa);
        System.out.println("O perimetro do paralelogramo: " + perimetro_pa);
   } 
    // RETANGULO
     private static void calcularAreaRet(Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_rt = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_rt = scanner.nextDouble();

        double area_rt = (2 * a_rt) + (2 * b_rt);
        System.out.println("A area do retangulo: " + area_rt);
        double perimetro_rt = a_rt * b_rt;
        System.out.println("O perimetro do retangulo: " + perimetro_rt);
    } 
    // QUADRADO
     private static void calcularAreaQua(Scanner scanner) {
        System.out.print("Digite o valor do lado: ");
        double l_q = scanner.nextDouble();

        double area_q = Math.pow(l_q, 2);
        System.out.println("A area do quadrado: " + area_q);
        double perimetro_q = 4 * l_q;
        System.out.println("O perimetro do quadrado: " + perimetro_q);
    }  
    // LOSANGO
     private static void calcularAreaLos(Scanner scanner) {
        System.out.print("Digite o valor de D: ");
        double D_ls = scanner.nextDouble();
        System.out.print("Digite o valor de d: ");
        double d_ls = scanner.nextDouble();
        System.out.print("Digite o valor de a: ");
        double a_ls = scanner.nextDouble();
        
        double area_ls = (D_ls * d_ls) / 2;
        System.out.println("A area do losango: " + area_ls);
        double perimetro_ls = 4 * a_ls;
        System.out.println("O perimetro do losango: " + perimetro_ls);
    }  
    //TRIANGULO
     private static void calcularAreaTri(Scanner scanner) {
        System.out.print("Digite o valor de a: ");
        double a_tri = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b_tri = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c_tri = scanner.nextDouble();
        System.out.print("Digite o valor de h: ");
        double h_tri = scanner.nextDouble();     
                
        double area_tri = (a_tri * h_tri) / 2;
        System.out.println("A area do triangulo: " + area_tri);
        double perimetro_tri = a_tri + b_tri + c_tri;
        System.out.println("O perimetro do triangulo: " + perimetro_tri);
    }     
    //TRIANGULO EQUILATERO
     private static void calcularAreaTriEq(Scanner scanner) {
        System.out.print("Digite o valor de lado: ");
        double l_treq = scanner.nextDouble();    
                
        double area_treq = Math.pow(l_treq, 2) * Math.sqrt(3) / 4;
        System.out.println("A area do triangulo equilatero: " + area_treq);
        double perimetro_treq =  3 * l_treq;
        System.out.println("O perimetro do triangulo equilatero: " + perimetro_treq);
    }  
    //CIRCUNFERENCIA
     private static void calcularAreaCir(Scanner scanner) {
        System.out.print("Digite o valor do raio: ");
        double r_cir = scanner.nextDouble();    
                
        double area_cir = Math.PI * Math.pow(r_cir, 2);
        System.out.println("A area da circunferencia: " + area_cir);
        double perimetro_cir = 2 * Math.PI * r_cir;
        System.out.println("O perimetro da circunferencia: " + perimetro_cir);
        }     
    }