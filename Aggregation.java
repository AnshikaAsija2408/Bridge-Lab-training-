public class Aggregation {
    //student has laptop
    static class Laptop{
        String brand;

        Laptop(String brand){
            this.brand=brand;
        }

        void showLaptop(){
            System.out.println("Laptop brand: "+brand);
        }
    }

    static class Student{
        String name ;
        Laptop laptop;

        Student(String name , Laptop  laptop){
            this.name =name;
            this.laptop=laptop;
        }

        void showDetails(){
            System.out.println("Student name: "+name);
            laptop.showLaptop();
        }
    }
    
        public static void main(String[] args) {
            Laptop lap = new Laptop("Dell");
            Student s = new Student("Alice", lap);
            s.showDetails();
        }
    }

