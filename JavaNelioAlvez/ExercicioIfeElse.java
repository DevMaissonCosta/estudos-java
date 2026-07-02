import java.util.Scanner;

public class ExercicioIfeElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int valor = sc.nextInt();
         if (valor < 0){
             System.out.println("NEGATIVO");
         } else {
             System.out.println("NAO NEGATIVO");
         }
sc.close();
    }
}
