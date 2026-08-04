package POO.entities;

public class Retangulo {

   public double largura;
   public double altura;

    public double area(){
        return largura * altura;
   }

   public double perimetro(){
        return 2 * ( altura + largura);
   }

   public double diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
   }

   public void informacoes(){
        System.out.printf("Area = %.2f%n", area());
       System.out.printf("Perimetro = %.2f%n", perimetro());
       System.out.printf("Diagonal = %.2f%n", diagonal());
    }

}
