package B;

public class Car {
    private String name = "Corolla";
    private String model = "2020";
    private String color = "Blue";
    private int tyres = 4;

    void engine(){
        System.out.println("The car engine is very power");
    }

    void interior(){
        System.out.println("The car contains seats, steering, dashboard...");
    }

    void exterior(){
        System.out.println("The car is made up color, tyres");
    }



    public static void main(String[] args) {
        Car Toyota = new Car();

        Toyota.engine();
        Toyota.interior();
        Toyota.exterior();
    }

}
