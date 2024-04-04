public class MergeSort {
    public void merge(int []arr, int low, int mid, int high){
        int n = arr.length;
        int [] temp = new int[n];
        int left  = low;
        int right = mid+1;
        int k = low;
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            
            }
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp[i-low];

        }
    }
    public int [] mergesort(int arr[], int low, int high){
        if(low >= high) return null;
        int mid = (low + high)/ 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid, high);
        return arr;
    }
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int [] arr = {2,6,3,5,1};
        int right = arr.length;
        int left = 0;
        System.out.println(obj.mergesort(arr, left, right));
    }
}
