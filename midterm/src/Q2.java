public class Q2 {
    public static void main(String[] args){
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();

        p1.getConnection();

    }
    public static class Printer{
        private static Printer printer=null;
        private Printer() {
        }
        public static Printer getInstance() {
            if (printer == null) {
                printer = new  Printer();
            }
            return printer;
        }

        public void getConnection() {
            System.out.println("Your Printer is working");
        }
    }

}
