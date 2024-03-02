import java.util.Scanner;

public class Recurssion {
    int count = 0;

    void printName(int n, String name) {
        if (count > n) {
            return;
        }
        System.out.println(name);
        count++;
        printName(n, name);
    }

    void printtoN(int n) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        count++;
        printtoN(n);
    }

    void FBackTracking(int i, int n) {
        if (i < 1) {
            return;
        }
        FBackTracking(i - 1, n);
        System.out.println(i);
    }

    void BBackTracking(int i, int n) {
        if (i > n) {
            return;
        }
        BBackTracking(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        Recurssion obj = new Recurssion();
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int n = sc.nextInt();
        // obj.printName(n, name);
        // obj.printtoN(n);
        int i = 0;
        obj.BBackTracking(i, n);
    }
}
