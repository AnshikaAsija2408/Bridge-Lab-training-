public class Abstraction {
    static abstract class Animal{

        abstract void sound(); //asbtract method

        //normal method
        void sleep(){
            System.out.println("sleeping");
        }
    }

    //child class 1
    static class Dog extends Animal{
        void sound(){
            System.out.println("dog barks");
        }
    }

    //child class 2
    static class Cat extends Animal{
        void sound(){
            System.out.println("cat meows");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();

        Cat c=new Cat();
        c.sound();
        c.sleep();

    }


}
