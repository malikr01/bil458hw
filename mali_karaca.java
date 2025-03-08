import java.util.Scanner;

public class ReversePyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
