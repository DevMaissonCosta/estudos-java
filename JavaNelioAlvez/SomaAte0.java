import java.util.Scanner;

public class SomaAte0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int valor;
        do {
            System.out.print("Digite um numero (0 para parar): ");
             valor = sc.nextInt();
            soma += valor;
            if (valor == 0) {
                System.out.println("A Soma total é: " + soma);
            }
        }while (valor != 0);
        sc.close();
        }
}
