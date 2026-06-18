public class ExerTernarioAninhado7 {
    public static void main(String[] args) {
        double saldo;
        saldo = 2 ;
        String categoria = (saldo <0) ? "Endividado" : (saldo == 0) ? "Saldo zerado" : "Saldo positivo";
        System.out.println(categoria);
    }
}
