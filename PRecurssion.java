import java.util.Scanner;

public class PRecurssion {
    void PFuction(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
        }
        PFuction(i - 1, sum + i);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        PRecurssion obj = new PRecurssion();
        obj.PFuction(i, 0);
    }
}