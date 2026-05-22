
package Review3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListProblem {
    int rollNo;
    String name;
    int marks;
    String branch;

    public ArrayListProblem(int rollNo, String name, int marks, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.branch = branch;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Branch: " + branch);
    }

}

class Data {
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayListProblem> students = new ArrayList<>();

    // int rollNo = sc.nextInt();
    // String name = sc.nextLine();
    // int marks = sc.nextInt();
    // String branch = sc.nextLine();

    void addStudent(int rollNo, String name, int marks, String branch) {
        students.add(new ArrayListProblem(rollNo, name, marks, branch));
    }

    void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (ArrayListProblem s : students) {
                s.display();
            }
        }

    }

    void searchByRollNo(int rollNo) {
        for (ArrayListProblem s : students) {
            if (s.rollNo == rollNo) {
                s.display();
                return;
            }
        }
    }

    void UpdateStudentMarks(int rollNo, int marks) {
        for (ArrayListProblem s : students) {
            if (s.rollNo == rollNo) {
                s.marks = marks;
                System.out.println("Marks updated successfully");
                return;
            }
        }
    }

    void deleteStudent(int rollNo) {
        for (ArrayListProblem s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student deleted successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    void sortByMarks() {
        Collections.sort(students, new Comparator<ArrayListProblem>() {
            public int compare(ArrayListProblem s1, ArrayListProblem s2) {
                return s2.marks - s1.marks;
            }
        });

        System.out.println("Students sorted by marks");
    }

    void displayToppers() {
        if (students.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        int maxMarks = students.get(0).marks;

        for (ArrayListProblem s : students) {
            if (s.marks > maxMarks) {
                maxMarks = s.marks;
            }
        }

        System.out.println("Topper(s):");
        for (ArrayListProblem s : students) {
            if (s.marks == maxMarks) {
                s.display();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort by Marks");
            System.out.println("7. Display Topper");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    d.addStudent(rollNo, name, marks, branch);
                    break;

                case 2:
                    d.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    d.searchByRollNo(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter Roll No to update marks: ");
                    int updateRoll = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    int newMarks = sc.nextInt();

                    d.UpdateStudentMarks(updateRoll, newMarks);
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    d.deleteStudent(deleteRoll);
                    break;

                case 6:
                    d.sortByMarks();
                    break;

                case 7:
                    d.displayToppers();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
// faced issue in logic of sort,topper and update methods