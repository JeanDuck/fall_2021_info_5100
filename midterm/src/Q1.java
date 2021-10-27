public class Q1 {
    public static void main(String[] args) {
    }
    public static abstract class Book{
        private String title;
        private double price;
        private String  publishYear;
        public Book(String title, double price, String publishYear){
            setTitle(title);
            setPrice(price);
            setPublishYear(publishYear);
        }
        abstract String description();
        public void getTitle(){
            System.out.println(this.title);
        }
        public void getPrice(){
            System.out.println(this.price);

        }
        public void getPublishYear(){
            System.out.println(this.publishYear);

        }
        public void setTitle(String title){
            this.title=title;

        }
        public void setPrice(double price){
            this.price=price;

        }
        public void setPublishYear(String  publishYear){
            this.publishYear=publishYear;
        }
    }
    public static interface iBorrowable {
        public void  setBorrowDate(int day);
        public void setReturnDate(int day);
        public boolean isAvailable(int day);
    }
    public static class Fiction extends Book implements iBorrowable{
        private int borrowDate;
        private int returnDate;
        private  String title;


        public Fiction(String title, double price, String publishYear) {
            super(title, price, publishYear);
        }

        @Override
        public void setBorrowDate(int day) {
            this.borrowDate=day;

        }

        @Override
        public void setReturnDate(int day) {
            this.returnDate=day;
        }

        @Override
        public boolean isAvailable(int day) {
            if(day<=returnDate&&day>=borrowDate){
                return false;
            }
            return true;
        }

        @Override
        String description() {
            return "Frankenstein"+title+" all events are imaginary and not based on real facts";
        }
    }
    public static class NonFiction extends Book implements iBorrowable{
        private int borrowDate;
        private int returnDate;
        private String title;
        public NonFiction(String title, double price, String publishYear) {
            super(title, price, publishYear);
        }

        @Override
        String description() {
            return "Anne Frank"+title+"all events are true and based on real facts.";
        }

        @Override
        public void setBorrowDate(int day) {
            this.borrowDate=day;

        }

        @Override
        public void setReturnDate(int day) {
            this.returnDate=day;

        }

        @Override
        public boolean isAvailable(int day) {
            if(day<=returnDate&&day>=borrowDate){
                return false;
            }
            return true;
        }
    }
    public static class Reference extends Book {
        private String category;
        private String title;
        private double price;

        public Reference(String title, double price, String category) {
            super(title, price, category);
            setTitle(title);
            setPrice(price);
            setCategory(category);
        }

        @Override
        String description() {
            return "World Maps+"+title+"+all information is real.";
        }
        public void getTitle(){
            System.out.println(this.title);
        }
        public void getPrice(){
            System.out.println(this.price);

        }
        public void getCategory(){
            System.out.println(this.category);

        }
        public void setTitle(String title){
            this.title=title;

        }
        public void setPrice(double price){
            this.price=price;

        }
        public void setCategory(String  category){
            this.category=category;
        }

    }
}
