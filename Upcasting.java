public class Upcasting {
    static public class AnimalSound {

        void bark() {
            System.out.println("Animal Sound");
        }
    }

    static class Dog extends AnimalSound {

        void bark() {
            System.out.println("Dog barks");
        }

    }

    public static void main(String[] args) {
        AnimalSound a = new Dog();
        a.bark();
    }
}
