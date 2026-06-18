public class ExerLogicoAnd3 {
    public static void main(String[] args) {
        int idade;
        boolean temCNH;
        idade = 19;
        temCNH = false;
        String situacao = ( idade >= 18) && (temCNH == true) ? "Liberado para dirigir" : "Não liberado";
        System.out.println(situacao);
    }
}
