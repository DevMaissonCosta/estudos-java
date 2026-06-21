import java.util.Scanner;

public class CondicionaisComposta2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o seu ano de nascimento!!");
        int nascimento = teclado.nextInt();
        int i = 2015 - nascimento;
        if (i>=18) {
            System.out.println("Maior");
        }else {
            System.out.println("De menor");
        }
    }
}
