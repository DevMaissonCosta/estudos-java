package POO.appplication;

import POO.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.next();
        System.out.print("Salario: ");
        funcionario.salario = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + funcionario);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();

        funcionario.AumentoSalario(porcentagem);
        System.out.println();
        System.out.println("Updated data: " + funcionario);
        sc.close();

    }
}
