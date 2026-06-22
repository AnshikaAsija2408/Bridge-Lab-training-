public class ExceptionHandling2 {
    public static void checkNumber(int num) {

        if (num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        }
        System.out.println("Valid number: " + num);
    }public

    static

    
    
    {
        checkNumber(-5);
    }catch(
    ArithmeticException e)
    {

        System.out.println("Caught exception: " + e.getMessage());
    }System.out.println("Program continues...");
}
