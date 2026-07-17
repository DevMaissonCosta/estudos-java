import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usuario;
       double valor1;
       double valor2;
       double soma1 = 0;
        do {
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Multiplicar dois números");
            System.out.println("0 - Sair");

            usuario = sc.nextInt();
            if (usuario == 1){
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            soma1 = valor1 + valor2;
                System.out.println(soma1);
            }
            else if (usuario == 2){
                valor1 = sc.nextDouble();
                valor2 = sc.nextDouble();
                soma1 = valor1 * valor2;
                System.out.println(soma1);
            } else if (usuario == 0){
                System.out.println("Encerramento...");
            }

        }while (usuario != 0);
        sc.close();
    }
}
