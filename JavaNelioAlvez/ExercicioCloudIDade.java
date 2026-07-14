import java.util.Scanner;

public class ExercicioCloudIDade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();


        if (idade <= 12){
            System.out.println("Criança");
        }else if (idade <= 17){
            System.out.println("Adolecente");
        }else
        {
            System.out.println("Adulta");
        }
        sc.close();
    }
}
