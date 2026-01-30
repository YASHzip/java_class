import java.util.Scanner;

class Static3{
    static int n;
    //int n;

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            //Static3 m = new Static3();
            //int n;
            //m.n = s.nextInt();
            n = s.nextInt();
            System.out.println(n);
            //System.out.println(m.n);
        }
    }
}