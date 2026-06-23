import java.util.Scanner;

public class Exercicio3while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int senha = 35267;

        System.out.println("Digite a senha: ");
        int usuario = teclado.nextInt();

        while (usuario != senha){
            System.out.println("Digite a senha: ");
         usuario = teclado.nextInt();;

        }
        System.out.println("Acesso liberado");

    }
}
