public class ExerRelacionalMaisLogico6 {
    public static void main(String[] args) {
        double saldo;
        double limiteChequeEspecial;
        saldo = -20;
        limiteChequeEspecial = 0;
        String r = (saldo > 0) || (Math.abs(saldo) <= limiteChequeEspecial) ? "Transação aprovada" : "Transação reprovada";
        System.out.println(r);
    }
}
