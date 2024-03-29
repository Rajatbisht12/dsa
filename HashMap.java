import java.util.Scanner;

public class HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the element");
        n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        for(int i = 0; i < n; i++){
            hash[arr[i]] +=1;
        }

        int q;
        System.out.println("Enter the number of queries");
        q = sc.nextInt();

        while(q-- > 0){
            int number;
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
        sc.close();
    }
}