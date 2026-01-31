class Parent {
    int parentValue = 100;
}

class Child extends Parent {
    int childValue = 200;

    void printValues() {
        System.out.println("Value using this: " + this.childValue);
        System.out.println("Value using super: " + super.parentValue);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printValues();
    }
}
