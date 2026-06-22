class Employee {
    static String companyName;
    static int totalEmployees = 0;
    int id;
    String name;
    String designation;

    static void displayTotalEmployees() {
        System.out.print("Total no of employees: " + totalEmployees);
    }

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public class Main {

        public static void main(String[] args) {
            Employee e1 = new Employee("Anshika", 288, "CEO");
            System.out.println(e1.name);
            Employee.displayTotalEmployees();
        }
    }
}
// displayTotalEmployees()was not counting the total number of employee