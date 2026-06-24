import java.util.Scanner;

public class ExercicioDeRepeticaoTabuada {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um numero: "); // aqui eu pedi um numero
        int usuario = digite.nextInt(); // -> usuario vai digitar
        int contador = 1; // -> eu tenho um numero fixo para ele comecar a multiplicar

        while (contador <= 10) // -> enquanto contator for menor que 10 ele vai multiplicando

        {
            int resultado = usuario * contador; // o meu resultado vai receber o valor digitado X o contador
            System.out.println("Reslutado: " + resultado);
            contador++; // aqui o meu contador vai ganhando mais 1 a cada multiplicacao

        }

    }
}


