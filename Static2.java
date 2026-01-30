import java.util.Scanner;

class Static2{
    //static int n;
    //int n;

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            //Static2 m = new Static2();
            int n;
            //m.n = s.nextInt();
            n = s.nextInt();
            System.out.println(n);
            //System.out.println(m.n);
        }
    }
}