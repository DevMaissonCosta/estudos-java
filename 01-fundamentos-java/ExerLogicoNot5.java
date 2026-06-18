public class ExerLogicoNot5 {
    public static void main(String[] args) {
        boolean contaBloqueada;
        contaBloqueada = false;
        String conta = (contaBloqueada != true)  ? "Acesso Permitido" : "Acesso negado";
        System.out.println(conta);
;
    }
}
