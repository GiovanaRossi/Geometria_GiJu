import static java.lang.Math.sqrt;
public class Plana {

    float b_tr;
    float B_tr;
    float c_tr; 
    float d_tr;
    float h_tr; 
    float area_tr;
    float perimetro1; 

    public void Trapezio(){
        B_tr = 4;
        b_tr = 2;
        c_tr = 6;
        d_tr = 6;
        h_tr = 12;
        area_tr = (h_tr * (b_tr + B_tr))/ 2;
        perimetro1 = c_tr + b_tr + d_tr + B_tr;

    }
    public void Paralelogramo(){

    }
    public void Retangulo(){

    }
    public void Quadrado(){

    }
    public void Losango(){

    }
    public void Triangulo(){

    }
    public void TrianguloEq(){

    }
    public void Circunferencia(){

    }

    public static void main(String[] args) {
        Plana pl = new Plana();

        System.out.println(pl.area_tr);
        System.out.println(pl.perimetro1);



    }
}