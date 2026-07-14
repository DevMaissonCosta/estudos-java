import java.util.Scanner;

public class ExercicioTabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int soma = 0;

        for (int i=z; i<=y; i++){
            soma = x * i;
            System.out.println( x + " x " + i + " : " + soma);



        }

        sc.close();
    }
}
