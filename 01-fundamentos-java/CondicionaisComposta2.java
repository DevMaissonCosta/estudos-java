import java.util.Scanner;

public class CondicionaisComposta2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o seu ano de nascimento!!");
        int nascimento = teclado.nextInt();

        System.out.println("Digite o ano que estamos!");
        int ano = teclado.nextInt();

        int idade = ano - nascimento;
        if (idade<16) {
            System.out.println("não pode votar " + idade + " anos");
        }else if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("A votacao é opcional  " + idade + " anos");
        } else
            System.out.println("É de total obrigação votar" + idade + " anos");
    }
}
