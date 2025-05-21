import java.util.*;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class Player extends User {
    int position;

    Player(String username, String password) {
        super(username, password);
        this.position = 0;
    }

    void moveForward() {
        position++;
    }

    void moveBackward() {
        position--;
    }
}

abstract class Entity {
    abstract void interact();
}

class Enemy extends Entity {
    void interact() {
        System.out.println("You encountered an enemy!");
    }
}

class Treasure extends Entity {
    void interact() {
        System.out.println("You found a treasure!");
    }
}

class Healer extends Entity {
    void interact() {
        System.out.println("You found a healer!");
    }
}

class Empty extends Entity {
    void interact() {
        System.out.println("It's empty here.");
    }
}

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static List<User> users = new ArrayList<>();
    static Random random = new Random();
    static Player currentPlayer;

    public static void main(String[] args) {
        System.out.println("=== Adventure Game ===");
        System.out.print("1. Login\n2. Register\nChoose: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            if (!login()) 
            return;
        } else if (choice == 2) {
            register();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        startGame();
    }

    static boolean login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                currentPlayer = new Player(username, password);
                System.out.println("Login successful! Welcome, " + username + "!");
                return true;
            }
        }
        System.out.println("Login failed.");
        return false;
    }

    static void register() {
        System.out.print("Choose Username: ");
        String username = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("Username already taken.");
                return;
            }
        }

        System.out.print("Choose Password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password);
        users.add(newUser);
        currentPlayer = new Player(username, password);
        System.out.println("Registration successful! You can now play.");
    }

    static void startGame() {
        System.out.println("\n=== Start Adventure ===");

        while (true) {
            System.out.println("\nYour position: " + currentPlayer.position);
            System.out.print("1. Move Forward\n2. Move Backward\n3. Quit\nChoose: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                currentPlayer.moveForward();
                encounter();

            } else if (choice == 2) {
                currentPlayer.moveBackward();
                encounter();

            } else if (choice == 3) {
                System.out.println("End Game. Bye!");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    static void encounter() {
        Entity[] encounters = { new Enemy(), new Treasure(), new Healer(), new Empty() };
        Entity e = encounters[random.nextInt(encounters.length)];
        e.interact();

        if (e instanceof Enemy) {
            System.out.println("Prepare to fight!");
        } else if (e instanceof Healer) {
            System.out.println("You feel refreshed!");
        }
    }
}