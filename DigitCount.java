import java.util.Scanner;

public class DigitCount {
    int count_func(int n) {
        int count = 0;
        while (n > 0) {
            int Last_Digit = n % 10;
            count += 1;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DigitCount obj = new DigitCount();
        System.out.println(obj.count_func(n));
    }
}
