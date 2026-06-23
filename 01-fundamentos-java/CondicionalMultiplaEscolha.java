import java.util.Scanner;

public class CondicionalMultiplaEscolha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas) // -> switch é a variável de multipla escoha que essa minha condicao tem.
        {
            case 1: // -> case é a opção, caso uma das opçoes da variavel switch sejá verdadeira, o case sera executado.
                tipo = "saci";
                break; // -> break diz pro switch sair do java, sem o breack ele fica executando tudo direto, sem combinar os valores.
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default: // -> default é o senao do switch
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
