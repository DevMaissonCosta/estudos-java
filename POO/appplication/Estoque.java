package POO.appplication;

import POO.entities.produts;

import java.util.Locale;
import java.util.Scanner;


public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produts produts = new produts();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        produts.nome = sc.nextLine();
        System.out.print("price: ");
        produts.price = sc.nextDouble();
        System.out.print("Quantidade de itens: ");
        produts.quantidade = sc.nextInt();

        System.out.println(produts);


    sc.close();
    }
}
