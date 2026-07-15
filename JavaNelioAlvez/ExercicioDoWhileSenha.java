import java.util.Scanner;

public class ExercicioDoWhileSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        int senhaC = 2002;

        while (senha != senhaC) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();
        }
            System.out.println("Acesso Permitido");
        sc.close();
        }

    }

