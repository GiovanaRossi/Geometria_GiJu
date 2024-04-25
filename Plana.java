import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Plana {

    double b_tr;
    double B_tr;
    double c_tr; 
    double d_tr;
    double h_tr; 
    double area_tr;
    double perimetro_tr;

    double a_pa;
    double b_pa;
    double h_pa;
    double area_pa;
    double perimetro_pa;

    double a_rt;
    double b_rt;
    double area_rt;
    double perimetro_rt;

    double l_q;
    double area_q;
    double perimetro_q;

    double a_ls;
    double D_ls;
    double d_ls;
    double area_ls;
    double perimetro_ls;

    double a_tri;
    double b_tri;
    double c_tri;
    double h_tri;
    double area_tri;
    double perimetro_tri;

    double l_treq;
    double h_treq;
    double area_treq;
    double perimetro_treq;

    double r_cir;
    double area_cir;
    double comprimento_cir;

    public void Trapezio(){ //ok
        area_tr = (h_tr * (b_tr + B_tr))/ 2;
        perimetro_tr = c_tr + b_tr + d_tr + B_tr;
    }
    public void Paralelogramo(){ //ok
        area_pa = a_pa * h_pa;
        perimetro_pa = (2 * a_pa) + (2 * b_pa);
    }
    public void Retangulo(){ //ok
        area_rt = (2 * a_rt) + (2 * b_rt);
        perimetro_rt = a_rt * b_rt;
    }
    public void Quadrado(){ //ok
        area_q = 4 * l_q;
        perimetro_q = Math.pow(l_q, 2);
    }
    public void Losango(){ //ok
        area_ls = (D_ls * d_ls) / 2;
        perimetro_ls = 4 * a_ls;
    }
    public void Triangulo(){
        area_tri = (a_tri * h_tri) / 2;
        perimetro_tri = a_tri + b_tri + c_tri;
    }
    public void TrianguloEq(){
        area_treq = 3 * l_treq;
        perimetro_treq = Math.pow(l_treq, 2) * Math.sqrt(3) / 4;
    }
    public void Circunferencia(){ //ok
        area_cir = Math.PI * Math.pow(r_cir, 2);
        comprimento_cir = 2 * Math.PI * r_cir;
    }

    public static void main(String[] args) {
        Plana pl = new Plana();

        System.out.println(pl.area_tr);
        System.out.println(pl.perimetro_tr);

        System.out.println(pl.area_pa);
        System.out.println(pl.perimetro_pa);
        
        System.out.println(pl.area_rt);
        System.out.println(pl.perimetro_rt);
        
        System.out.println(pl.area_q);
        System.out.println(pl.perimetro_q);
        
        System.out.println(pl.area_ls);
        System.out.println(pl.perimetro_ls);
        
        System.out.println(pl.area_tri);
        System.out.println(pl.perimetro_tri);
        
        System.out.println(pl.area_treq);
        System.out.println(pl.perimetro_treq);
        
        System.out.println(pl.area_cir);
        System.out.println(pl.comprimento_cir);
    }
}