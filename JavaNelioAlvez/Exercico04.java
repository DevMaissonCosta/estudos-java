import java.util.Locale;
import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFun, horasT;
        double valorHora, salario;

        System.out.println("Numero do funcionario: " );
        numFun = sc.nextInt();
        System.out.println("Horas Trabalhadas: " );
        horasT = sc.nextInt();
        System.out.println("Valor por hora: ");
        valorHora = sc.nextDouble();

        salario = horasT * valorHora;
        System.out.println("NUMBER = " + numFun);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();


    }
}
