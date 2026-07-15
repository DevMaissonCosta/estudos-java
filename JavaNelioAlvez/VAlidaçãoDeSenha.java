import java.util.Scanner;


public class VAlidaçãoDeSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
      int senhaV = 1234;


        do {
            System.out.print("Digite a senha: ");
             senha = sc.nextInt();
             if (senha != senhaV) {
                 System.out.println("Senha incorreta, tente novamente.");
             }
        } while(senha != senhaV);

        System.out.println("Acesso liberado!");
sc.close();
    }
}
