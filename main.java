import java.util.Scanner;
import static java.lang.Math.*;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sc1 = scanner.nextDouble();
        double sc2 = scanner.nextDouble();
        if ((sc1 * sc2)>20){
            System.out.println(1 / tan(sc2));
        } else {
            System.out.println(sc1 / 3);
        }
    }
}