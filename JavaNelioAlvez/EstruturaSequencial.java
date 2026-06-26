
import java.util.Locale;

public class EstruturaSequencial {
    public static void main(String[] args) {
  double x = 10.345676;
        System.out.println(x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }
}
