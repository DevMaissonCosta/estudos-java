public class CalcularDesconto {

   public static double calcularDesconto(double valor, int quantidade){
       double desconto;
       if (quantidade >= 10){
            desconto = valor - (valor * 0.20);

       }else {
           desconto = valor - (valor * 0.10);
       }
       return desconto;
   }

    public static void main(String[] args) {
        System.out.println(calcularDesconto(200, 5));
    }

}
