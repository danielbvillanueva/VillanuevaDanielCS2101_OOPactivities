public class Car {
    private String color;
    private double price;
    private char size;

    // Constructor
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);  
    }

    //getters
    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public char getSize(){
        return size;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSize(char size){
        this.size = size; 
    }

    public String toString() {
        String sizeDescriptor;
    
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unknown";  
                break;
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }   
}
