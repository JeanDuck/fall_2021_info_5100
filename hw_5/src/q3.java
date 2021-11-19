import java.util.HashSet;

public class q3 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10); Item item2 = new Item("5678",40);
        cart.addItem(item1); cart.addItem(item2);
        cart.pay(new PaypalStrategy("myemail@example.com")); cart.pay(new CreditCardStrategy( "1234567890123456"));
    }
    public static class Item{
        private String Id;
        private int price;
        public Item(String str,int n){
            Id=str;
            price=n;
        }

        public Item() {

        }

        public String getId(){
            return Id;

        }
        public int getPrice(){
            return price;

        }
    }
    public static class ShoppingCart extends Item{
        private HashSet<Item> set=new HashSet<>();
        public ShoppingCart(){
            super();

        }
        public void addItem(Item item){
            set.add(item);

        }
        public void removeItem(Item item){
            set.remove(item);

        }
        public int calculateTotal(){
            int sum=0;
            for(Item item:set){
                sum+=item.getPrice();
            }
            return sum;

        }
        public void pay(PaymentStrategy p){
            int sum=calculateTotal();
            p.pay(sum);
        }

    }
    public static interface PaymentStrategy{
        public default void pay(int n){

        }
    }
    public static class CreditCardStrategy implements PaymentStrategy{
        String cardNumber;
        public CreditCardStrategy(String str){
            cardNumber=str;
        }

        @Override
        public void pay(int n) {
            PaymentStrategy.super.pay(n);
            System.out.println("CreditCard : $"+n);
        }
    }
    public static class PaypalStrategy implements PaymentStrategy{
        String email;
        public PaypalStrategy(String str){
            email=str;
        }

        @Override
        public void pay(int n) {
            PaymentStrategy.super.pay(n);
            System.out.println("Paypal : $"+n);
        }
    }
}
