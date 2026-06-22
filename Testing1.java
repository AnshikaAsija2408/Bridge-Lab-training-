public class Testing1 {
    public class Calculator{
       static int add(int a , int b){
            return a+b;
        }

       static int multiply(int a , int b){
            return a*b;
        }

        static int divide(int a , int b){
            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a/b;
        }
    }
}
