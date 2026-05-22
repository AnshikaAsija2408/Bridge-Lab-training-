package Review3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Users {
    String username;
    int userId;

    Users(String username, int userId) {
        this.username = username;
        this.userId = userId;
    }

    void display() {
        System.out.println("users=" + username);
        System.out.println("userId=" + userId);
    }
}

class Posts {
    int postId;
    int userId;

    String content;

    Posts(int postId, int userId, String content) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
    }

    void display() {
        System.out.println("postId=" + postId);
        System.out.println("userId" + userId);
        System.out.println("content=" + content);
    }
}

class SocialMediaSystem {
    Scanner sc = new Scanner(System.in);
    ArrayList<Users> users = new ArrayList<>();
    LinkedList<Posts> posts = new LinkedList<>();

    public void addUser(String username, int userId) {
        users.add(new Users(username, userId));
    }

    public void createPost(int postId, int userId, String content) {
        posts.addFirst(new Posts(postId, userId, content));
    }

    public void deletePost(int postId) {
        Posts toRemove = null;
        for (Posts p : posts) {
            if (p.postId == postId) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            posts.remove(toRemove);
        }
    }

    public void displayFeed() {
        for (Posts p : posts) {
            p.display();
        }
    }

    public void searchUserPosts(int userId) {
        for (Posts p : posts) {
            if (p.userId == userId) {
                p.display();
            }
        }
    }

    public static void main(String[] args) {
        SocialMediaSystem system = new SocialMediaSystem();
        Scanner sc = new Scanner(System.in);

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
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter userId: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    system.addUser(username, userId);
                    break;
                case 2:
                    System.out.print("Enter postId: ");
                    int postId = sc.nextInt();
                    System.out.print("Enter userId: ");
                    int postUserId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter content: ");
                    String content = sc.nextLine();
                    system.createPost(postId, postUserId, content);
                    break;
                case 3:
                    System.out.print("Enter postId to delete: ");
                    int deleteId = sc.nextInt();
                    system.deletePost(deleteId);
                    break;
                case 4:
                    system.displayFeed();
                    break;
                case 5:
                    System.out.print("Enter userId: ");
                    int searchId = sc.nextInt();
                    system.searchUserPosts(searchId);
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
