package POO.appplication;

import POO.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class AplicacaoRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();
        retangulo.informacoes();
    }
}
