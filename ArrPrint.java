import java.util.Scanner;

class ArrPrint {
    public static void main(String[] args) {
        
        
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            System.out.println("Enter the array elements: ");
            for(int i = 0; i <= n - 1; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i <= n-1; i++){
                System.out.println(arr[i] + " ");
            }
        }

    }
}
