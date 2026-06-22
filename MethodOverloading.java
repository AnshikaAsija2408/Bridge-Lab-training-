import java.util.*;
public class MethodOverloading {   //calculator
    static class Calculator{

    int add(int a , int b){
        return a+b;
    }

     int add(int a, int b, int c){
        return a+b+c;
    }

     double add(double a , double b){
        return a+b;
    }
    
}

     
        public static void main(String[] args){
            Calculator mo = new Calculator();
            int result1 = mo.add(10,20);
            int result2=mo.add(5,10,15);
            double result3 = mo.add(2.5,3.5);

            System.out.println(result1);

        
    }
}