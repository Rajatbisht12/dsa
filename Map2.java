import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int number = sc.nextInt();
            System.out.println(map.get(number));
        }
        sc.close();
    }
    
}
