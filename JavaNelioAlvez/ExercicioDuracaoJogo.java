import java.util.Scanner;

public class ExercicioDuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracao ;
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal ){
            duracao = horaInicial - horaFinal;

        }else {

            duracao = horaInicial - horaFinal - 24;
        }

        System.out.println("O JOGO DUROU " + Math.abs(duracao) + " HORA(S) ");

        sc.close();
    }
}
