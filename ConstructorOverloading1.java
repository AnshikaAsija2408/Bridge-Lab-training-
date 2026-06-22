class ConstructorOverloading1 {
    static class Student {
        String name;
        int age;

        // constructor
        Student() {
            this("Anshika", 20);
            System.out.println("Default");
        }

        Student(String name, int age) {

            this.name = name;

            this.age = age;
            System.out.println("Parameterized");

        }

        void display() {
            System.out.println(name + " " + age);

        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        // Student s2 = new Student("Rohit", 22);
        // s2.display();
    }

}