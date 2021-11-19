public class q2 {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
    public static interface Shape{
        public default void draw(){

        }

    }
    public static class Circle implements Shape{
        @Override
        public void draw() {
            Shape.super.draw();
            System.out.println("Drawing a Circle");
        }
    }
    public static class Rectangle implements Shape{
        @Override
        public void draw() {
            Shape.super.draw();
            System.out.println("Drawing a Rectangle");
        }
    }
    public static class Square implements Shape{
        @Override
        public void draw() {
            Shape.super.draw();
            System.out.println("Drawing a Square");
        }
    }
    public static class  ShapeMaker implements Shape{
        private Circle circle = new Circle() ;
        private Rectangle rectangle = new Rectangle();
        private Square square = new Square();
        public ShapeMaker(){

        }
        public void drawCircle(){
            circle.draw();
        }
        public void drawRectangle(){
            rectangle.draw();

        }
        public void drawSquare(){
            square.draw();

        }

    }
}
