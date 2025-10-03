import java.util.Scanner;
import static java.lang.Math.*;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        if (x <= -2){
            System.out.println(pow(x, 5)-tan((2*x)-1));
            System.out.println(exp(sin(x)));
        } else if (x > 1) {
            System.out.println(pow(sin(x), 5));
            System.out.println(sqrt(cos(x)));
        } else {
            System.out.println((3*x)*(1+exp(x+1)));
            System.out.println(pow(x, 2));
        }
    }
}