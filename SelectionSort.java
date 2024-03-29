import java.util.Scanner;

public class SelectionSort {
    public void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = 0; j < n; j++){
                if(arr[j] < arr[min]){
                    SelectionSort obj = new SelectionSort();
                    obj.swap(arr, j, min);
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
