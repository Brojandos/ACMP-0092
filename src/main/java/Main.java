import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int craneQuantity = new Scanner(System.in).nextInt();
        System.out.printf("%d %d %d", craneQuantity / 6, craneQuantity * 2 / 3, craneQuantity / 6);
    }
}
