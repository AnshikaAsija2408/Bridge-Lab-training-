package Review3;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedListProblem {
    int coachId;
    String coachType;
    int passengerCount;

    LinkedListProblem(int coachId, String coachType, int passengerCount) {
        this.coachId = coachId;
        this.coachType = coachType;
        this.passengerCount = passengerCount;
    }

    void display() {
        System.out.println("coachId=" + coachId);
        System.out.println("coachType=" + coachType);
        System.out.println("passengerCount=" + passengerCount);
    }
}

class CoachManagement {
    Scanner sc = new Scanner(System.in);
    LinkedList<LinkedListProblem> list = new LinkedList<>();
    // int coachId = sc.nextInt();
    // String coachType = sc.nextLine();
    // int passengerCount = sc.nextInt();

    public void addCoachAtBeg(int coachId, String coachType, int passengerCount) {
        list.addFirst(new LinkedListProblem(coachId, coachType, passengerCount));
    }

    public void addCoachAtEnd(int coachId, String coachType, int passengerCount) {
        list.addLast(new LinkedListProblem(coachId, coachType, passengerCount));
    }

    // public void removeCoach() {
    // list.remove(new LinkedListProblem(coachId, coachType));
    // }
    public void removeCoach(int coachId) {
        for (LinkedListProblem l : list) {
            if (l.coachId == coachId) {
                list.remove();
            }
        }
    }

    public void DisplayTrain() {
        for (LinkedListProblem l : list) {
            l.display();
        }
    }

    public void SearchCoach(int coachId) {
        for (LinkedListProblem l : list) {
            if (l.coachId == coachId) {
                l.display();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoachManagement cm = new CoachManagement();
        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. Create Post");
            System.out.println("3. Delete Post");
            System.out.println("4. Display Feed");
            System.out.println("5. Search User Posts");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter coachId: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter coachType: ");
                    String type1 = sc.nextLine();

                    System.out.print("Enter passengerCount: ");
                    int count1 = sc.nextInt();

                    cm.addCoachAtBeg(id1, type1, count1);
                    break;

                case 2:
                    System.out.print("Enter coachId: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter coachType: ");
                    String type2 = sc.nextLine();

                    System.out.print("Enter passengerCount: ");
                    int count2 = sc.nextInt();

                    cm.addCoachAtEnd(id2, type2, count2);
                    break;

                case 3:
                    System.out.print("Enter coachId to remove: ");
                    int removeId = sc.nextInt();
                    cm.removeCoach(removeId);
                    break;

                case 4:
                    cm.DisplayTrain();
                    break;

                case 5:
                    System.out.print("Enter coachId to search: ");
                    int searchId = sc.nextInt();
                    cm.SearchCoach(searchId);
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }

        }
    }
}
