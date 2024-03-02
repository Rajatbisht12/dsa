import java.util.Scanner;

public class ReverseNum {
    int ReverseNum(int n) {
        int RevNum = 0;
        while (n > 0) {
            int Last_Digit = n % 10;
            n = n / 10;
            RevNum = (RevNum * 10) + Last_Digit;
        }
        return RevNum;
    }

    boolean Palindrome(int ReverseNum, int n) {
        if (ReverseNum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseNum obj = new ReverseNum();
        boolean Palindrome = obj.Palindrome(obj.ReverseNum(n), n);
        System.out.println(Palindrome);
    }
}
