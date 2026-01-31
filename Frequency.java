import java.util.Scanner;

class Frequency {
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of array: ");
            for(int i = 0; i <= n-1; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the number you want to find the frequency of: ");
            int x = sc.nextInt();

            int freq = 0;

            for(int i = 0; i <= n-1; i++){
                if(x == arr[i]){
                    freq++;
                }
            }
            System.out.println("The freqency of " + x + " is " + freq);

        }
    }
}
