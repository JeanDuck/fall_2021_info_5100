public class q1 {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
    public static interface Car{
        public default void assemble(){
        }
    }

    public static class CarDecorator implements Car{
        @Override
        public void assemble() {
            Car.super.assemble();
            System.out.print("Adding features of ");
        }
    }
    public static class BasicCar implements Car{
        @Override
        public void assemble() {
            Car.super.assemble();
            System.out.print("Basic Car.");
        }
    }
    public static class SportsCar extends CarDecorator{
        @Override
        public void assemble() {
            super.assemble();
            System.out.print("Sports Car.");

        }

        public SportsCar(Car car){
            car.assemble();
        }

    }
    public static class LuxuryCar extends CarDecorator{
        @Override
        public void assemble() {
            super.assemble();
            System.out.print("Luxury Car.");
        }

        public LuxuryCar(Car car){
            car.assemble();
        }

    }
}
