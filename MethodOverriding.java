class First{
    int sum(int a, int b){
        return a + b;
    }
}

class Second extends First{
    @Override
    int sum(int a , int b){
        return a + b;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        First obj = new Second();

        System.out.println(obj.sum(4 , 5));
    }
}
