import java.util.Scanner;

public class Exercicio2while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite um número (0 para parar)");
       int usuario = teclado.nextInt();

        while (usuario != 0 ){
            soma = soma + usuario;
            System.out.println("Digite um numero (0 para parar)");
            usuario = teclado.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }
}
