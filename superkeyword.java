public class superkeyword {
    static class Animal{
        void sound(){
            System.out.println("Animal makes sound");
        }
    }

    static class Dog extends Animal{
        void sound(){
            super.sound();
            System.out.println("Dog Barks");
        }
    }

    public static void main(String [] args){
        Dog d = new Dog();
        d.sound();
    }
}
