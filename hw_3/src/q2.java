public class q2 {
    public static void main(String[] args) {
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100
    }
    public interface MathOperation {
        public int performOperation(int num1, int num2);
    }
    public static class AddOperation implements MathOperation{
        @Override
        public int performOperation(int num1, int num2) {
            int ans=num1+num2;
            return ans;
        }
    }
    public static class SubtractOperation implements MathOperation{
        @Override
        public int performOperation(int num1, int num2) {
            int ans=num1-num2;
            return ans;
        }
    }
    public static class MultiplyOperation implements MathOperation{
        @Override
        public int performOperation(int num1, int num2) {
            int ans=num1*num2;
            return ans;
        }
    }
    public static class Context {
        MathOperation operation;
        public Context(MathOperation operation) {
            this.operation = operation;
        }
        public int execute(int num1, int num2) {
            return operation.performOperation(num1,num2);
        }
    }

}
