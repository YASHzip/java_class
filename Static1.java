import java.util.Scanner;

class Static1{
    //static int n;
    int n;

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            Static1 m = new Static1();
            //int n;
            m.n = s.nextInt();
            //n = s.nextInt();
            //.out.println(n);
            System.out.println(m.n);
        }
    }
}