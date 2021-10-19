public class q1 {
    public static void main(String[] args) {
        Psychiatrist psy = new Psychiatrist();
        Sad sadObj = new Sad();
        Happy hapObj=new Happy();

        psy.examine(hapObj);
        System.out.println();
        psy.observe(hapObj);
        String ob1=psy.toString();
        System.out.println(ob1);

        System.out.println();

        psy.examine(sadObj);
        System.out.println();
        psy.observe(sadObj);
        String ob2=psy.toString();
        System.out.println(ob2);
    }
    public static abstract class Moody{
        abstract String getMood();
        abstract void ExpressFeelings();
        public void queryMood(){

        }
    }
    public static class Sad extends Moody{

        @Override
        String getMood() {
            return "I feel sad Today";
        }

        @Override
        void ExpressFeelings() {
            System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘");
        }

        public String toString() {
            return "Subject cries a lot";
        }
    }
    public static class Happy extends Moody{

        @Override
        String getMood() {
            return "I feel happy Today";
        }

        @Override
        void ExpressFeelings() {
            System.out.println("heeehee....hahahah...HAHAHA!!");

        }

        public String toString() {
            return "Subject laughs a lot";
        }
    }
    public static class Psychiatrist{
        String moody;
        public void examine(Moody obj){
            System.out.println("How are you feeling today?");
            System.out.println(obj.getMood());
        };
        public void observe(Moody obj){
            obj.ExpressFeelings();
            moody=obj.toString();
        };
        public String toString(){
            return "Observation:"+ moody;

        };

    }

}
