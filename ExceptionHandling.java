public class ExceptionHandling {
    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("hello");
        try {
            int result = 10 / 0;
            System.out.println(a[10]);
        }
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Error: Index out of bounds");
        // } catch (ArithmeticException e) { // e is the reference variable of the
        // exception object
        // System.out.println(e.getMessage());
        // System.out.println(e.getStackTrace());
        // System.out.println(e);
        // }

        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage()); // common handling for multiple exceptions
        } catch (RuntimeException e) {
            System.out.println("Runtime exception occurred: ");
        }
        // catch(Exception e){ //all exceptions are handled by this block but it is not
        // recommended to use this as it will catch all exceptions and we won't be able
        // to handle specific exceptions
        // System.out.println("General exception occurred: ");
        // }
        System.out.println("bye");

    }
}
