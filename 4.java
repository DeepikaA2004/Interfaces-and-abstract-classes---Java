//interface declaration
interface Polygon_Shape {
    void calculateArea(int length, int breadth);
}

// implement the interface
class Rectangle implements Polygon_Shape {
    // implement the interface method
    public void calculateArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Demo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(); // declare a class object
        rect.calculateArea(10, 20); // call the method
    }
}