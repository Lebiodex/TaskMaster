import java.util.Scanner;

public class Login {
    public void CreatingAccount(){
        Scanner accountScanner = new Scanner(System.in);

        System.out.println("| Create account |");
        System.out.println("Username:");
        String username = accountScanner.next();
        System.out.println("Password:");
        String password = accountScanner.next();

        Users users = new Users();
        users.addUser(new User(username,password));

        System.out.println("Login successful!");
    }
}
