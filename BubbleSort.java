import java.util.Scanner;

public class BubbleSort {
    public void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        BubbleSort obj = new BubbleSort();
        for(int i = n-1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j < i-1; j++){
                if(arr[j] > arr[j+1]){
                    obj.swap(arr, j, j+1);
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }    
}
