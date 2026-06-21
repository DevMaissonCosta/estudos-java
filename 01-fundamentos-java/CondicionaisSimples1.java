import java.util.Scanner;

public class CondicionaisSimples1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua Média é: " + m);
        if (m>9){
            System.out.println("Parabens!!");
        }
    }
}
