package POO;

import POO.entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y; // criei uma entidade, e tranformei o traigulo em um tipo;
        x = new Triangulo(); // instanciei
        y = new Triangulo(); // instanciei

        System.out.println("Entradas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b= sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entradas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c= sc.nextDouble();


        double areaX = x.area(); // aqui eu fiz a chamada do meu metodo que no caso é x.area()
        double areaY = y.area(); // aqui eu fiz a chamada do meu metodo que no caso é y.area()


        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior Largura: X");
        }else {
            System.out.println("Maior Largura: Y");
        }

        sc.close();
    }
}
