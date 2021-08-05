package C;

public class Car {
    private String name = "Corolla";
    private String model = "2020";
    private String color = "Blue";
    private int tyres = 4;

    void method1(){
        System.out.println("This car drive method1");
    }
    void method2(){
        System.out.println("This car drive method2");
    }
    void method3(){
        System.out.println("This car drive method3");
    }

    public static void main(String[] args) {
        Car Mitsu = new Car();
        Mitsu.method1();
        Mitsu.method2();
        Mitsu.method3();

    }

}
