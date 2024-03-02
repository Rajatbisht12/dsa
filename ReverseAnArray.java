import java.util.Scanner;

class ReverseAnArray {
    int[] swap(int l, int[] arr, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return arr;
    }

    void fun(int i, int arr[], int n) {
        if (i >= n / 2) {
            return;
        }
        swap(i, arr, (n - i - 1));
        fun(i + 1, arr, n);
    }

    public static void main(String[] args) {
        ReverseAnArray obj = new ReverseAnArray();
        int j = 0;
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        obj.fun(j, arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}