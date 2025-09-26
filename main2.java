import java.util.Scanner;
import static java.lang.Math.*;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(min(a, b)-(2*sqrt(max(a, b)))/(1+(max(a, b)/min(a, b))));

    }
}
