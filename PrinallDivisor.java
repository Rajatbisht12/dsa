import java.util.Scanner;

class PrinallDivisor {
    int Divisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        return 0;
    }

    int SqrtDivisor(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                if ((n / i) != 1) {
                    System.out.println(n / i);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrinallDivisor obj = new PrinallDivisor();
        obj.Divisor(n);
        obj.SqrtDivisor(n);
    }
}