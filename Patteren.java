import java.util.Scanner;

class Patteren {
    void Fpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    void Rpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                System.out.print("*");
            }
            for (int l = 0; l < +i; l++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Patteren obj = new Patteren();
        obj.Fpattern(n);
        obj.Rpattern(n);
    }
}