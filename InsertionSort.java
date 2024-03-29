import java.util.Scanner;

public class InsertionSort {
    public void swap(int [] arr, int i, int j){
        if(arr[i] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        InsertionSort obj = new InsertionSort();
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                obj.swap(arr, j-1, j);
                j--;
            }
        }
        sc.close();
    }
}
