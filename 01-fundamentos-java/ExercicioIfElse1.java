import java.util.Scanner;

public class ExercicioIfElse1 {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = digite.nextDouble();

        if (numero % 2 == 0 ){ // -> todo numero divido por 2, se sobrar é IMPAR "% -> Sinal de resto."
            System.out.println("É par");
        } else{
            System.out.println("É impar");
        }
    }
}
