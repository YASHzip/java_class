class Student {

    Student() {
        System.out.println("Constructor called from Student class");
    }
}

public class ConstructorCall {

    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println("Object reference: " + obj);
    }
}
