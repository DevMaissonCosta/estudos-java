package POO.entities;

public class Retangulo {
    double largura;
    double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetetro(){
        return (2 * largura) + (2 * altura);
    }

    public double diagonal(){
        return Math.sqrt((largura * largura ) + altura * altura ) ;
    }

}
