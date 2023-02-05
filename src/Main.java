public class Main {
    public static void main(String args[]){
        Shape shape = new Rectangle(1.2d, 3.4d);
        Shape shape2 = new Circle(4.0d);

        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(shape));
        System.out.println(areaCalculator.calculateArea(shape2));
    }
}
