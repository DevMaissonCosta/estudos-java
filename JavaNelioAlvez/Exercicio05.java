import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double valor1, valor2, vPagar1, vPagar2, vtotal;
        System.out.println("Codigo item 1: ");
        cod1 = sc.nextInt();

        System.out.println("Numero de peças 1: ");
        num1 = sc.nextInt();

        System.out.println("Valor 1: ");
        valor1 = sc.nextDouble();

        System.out.println("Codigo item 2: ");
        cod2 = sc.nextInt();

        System.out.println("Numero de peças 2: ");
        num2 = sc.nextInt();

        System.out.println("Valor 2: ");
        valor2 = sc.nextDouble();

        vPagar1 = num1 * valor1;
        vPagar2 = num2 * valor2;

        vtotal = vPagar1 + vPagar2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", vtotal );
        sc.close();
    }
}
