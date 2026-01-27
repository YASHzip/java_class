class Car{
    int modelYear;
    int mileage;

    public static void main(String[] args){
        Car c1 = new Car();
        c1.modelYear = 2005;
        c1.mileage = 50;

        System.out.println(c1.modelYear);
        System.out.println(c1.mileage);
    }
}