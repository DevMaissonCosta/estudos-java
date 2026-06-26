public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;

            if (cc == 5 || cc == 7 || cc == 10){
                continue; // vai interromper essas alteraçoes a cima no loop.
            }
            if (cc == 9){
                break; // ao chegar na numeração 9, a operacao sera parada.
            }

            System.out.println("Cambalhota" + cc);
        }
    }
}
