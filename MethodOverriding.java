public class MethodOverriding {
    static class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }

    //child class
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog Barks");
        }
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();

    }
}
