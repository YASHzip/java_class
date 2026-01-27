// WAp to check weather an array contains duplicate or not
import java.util.Scanner;

class Duplicate{
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter "+ n + "elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean dFound = false;
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n  ; j++){
                    if(arr[i] == arr[j]){
                        dFound = true;
                        break;
                    }
                    if(dFound) break;
                }
            }
            if(dFound){
                System.out.println("Duplicate found");
            }else{
                System.out.println("Duplicate not found");
            }
        }
   }
}