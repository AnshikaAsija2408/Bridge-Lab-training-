public class Testing2 {
    class Bank {
    

    int withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        return balance - amount;
    }
}
}