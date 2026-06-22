import java.util.*;
public class encapsulation {
    // public class Student{
    //     String name ;
    //     int rollnmbr;
    //     private int age ;

    //     public void setAge(int age){
    //         if(age<0){
    //             age =0;
    //         }
    //         this.age =age;
    //     }

    //     public int getAge(){
    //         return this.age;
    //     }
    // }

    // public static void main(String[] args) {
    //     Student st=new Student();
    //     st.name = "Anshi";
    //     st.rollnmbr="3";
    //     st.setAge(21);
    //     System.out.println(st.age);
    // }

        static class BankAccount{
            
            private long accno;
            private double balance;

            public void  deposit(double amount){
                if(amount>0){
                    balance+=amount;
                    System.out.println("Deposited: "+amount);
                }else{
                    System.out.println("Invalid deposit amount");
                }
            }

            public void withdraw(double amount){
                if(amount>0 && amount<=balance){
                    balance-=amount;
                    System.out.println("withdrew "+amount);
                } else{
                    System.out.println("invalid amount");
                }
            }

            public void setaccno(long accno){
                this.accno=accno;
            }

            public double getBalance(){
                return balance;
            }
        }

        public static void main(String[] args) {
            BankAccount  bankaccount = new BankAccount();
            bankaccount.setaccno(2323);
            bankaccount.withdraw(-19);
            bankaccount.deposit(-30);
            bankaccount.withdraw(834);
            bankaccount.deposit(100);
            System.out.println(bankaccount.getBalance());
        }
}
