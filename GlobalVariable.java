import java.util.Scanner;

public class GlobalVariable {
    int n;
    int sum = 0;
    
    public static void main(String[] args){
        GlobalVariable m = new GlobalVariable();
        Scanner s = new Scanner(System.in);

        m.n = s.nextInt();
    }
}
