import javax.swing.JOptionPane;

public class ExercicioDeRepetocao {
    public static void main(String[] args) {
        int n, s = 0;
        int p = 0;
        int i = 0;
        double media;

        do {
            // JOptionPane, usa caixa de dialogos, para informar entrada ou saida de dados.
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero: "));
            s += n;
            p += s;
            i += s;
            media = (n / 3);
        } while (n != 0);
        if (p % 2 == 0){
        }
        JOptionPane.showMessageDialog(null, "Resultado final " + s + "Média dos valores " + media);

    }

}
