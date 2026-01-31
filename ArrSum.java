import java.util.Scanner;

class ArrSum {

    public static void main(String[] args) {

        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter size of array: ");
            int n = s.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            int sum = 0;

            for(int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum += arr[i];
            }

            System.out.println("Sum of array elements = " + sum);

            if(args.length > 0) {
                System.out.println("First command-line argument: " + args[0]);
            }
        }
    }
}
