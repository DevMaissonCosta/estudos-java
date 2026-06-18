public class ExerLogicoOr4 {
    public static void main(String[] args) {
        double saldo;
        boolean temContaPremium;
        saldo = 20;
        temContaPremium = false;

        String cliente = (saldo > 0) || (temContaPremium == true) ? "Pode fazer o saque" : "Saque não permitido";

        System.out.println(cliente);
    }
}
