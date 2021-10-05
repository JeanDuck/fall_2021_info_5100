public class question2 {
    public static void main(String[] args) {
        Sum sum=new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4

    }
    public static class Sum{
        public Sum(){

        }
        public int add(int a,int b){
            return a+b;
        }
        public double add(int a,double b){
            return a+b;
        }
        public double add(double a,int b){
            return a+b;
        }
        public double add(double a,double b){
            return a+b;
        }
        public int add(int a,int b,int c){
            return a+b+c;
        }
    }
}
