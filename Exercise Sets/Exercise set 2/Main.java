public class Main{  
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        System.out.println(car1.toString());  

        Car car2 = new Car("blue", 50000.00, 'L');
        System.out.println(car2.toString());  

        Car car3 = new Car("green", 9000.00, 'S');
        System.out.println(car3.toString());
    }
}
