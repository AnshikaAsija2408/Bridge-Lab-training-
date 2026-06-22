import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testing2Test {
    class BankTest {
        Bank bank  = new Bank(

        @Test 
        void testWithdraw(){
            assertThrows(IllegalArgumentException.class, () -> bank.withdraw(1000, 1500));
        }
