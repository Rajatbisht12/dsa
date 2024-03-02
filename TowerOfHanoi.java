public class TowerOfHanoi {
    public static void ToH(int n, int A, int B, int C) {
        if (n > 0) {
            ToH(n - 1, A, C, B);
            System.out.print(A);
            System.out.println(C);
            ToH(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {
        ToH(3, 1, 2, 3);
    }
}
