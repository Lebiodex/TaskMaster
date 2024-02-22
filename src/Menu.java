import java.util.Scanner;

public class Menu  {
    public void MainMenu(){

        Scanner menuScanner = new Scanner(System.in);
        Tasks tasks = new Tasks();

        System.out.println("Welcome to our app!");
        while (true) {
            System.out.println("| 1. Add task | 2. Remove task | 3. Modify task | 4. Find task | 5. Refresh | 6. Exit |");
            int choice = menuScanner.nextInt();

            switch (choice) {
                case 1:
                    tasks.createTask();
                    break;
                case 2:
                    tasks.removeTask();
                    break;
                case 3:
                    tasks.modifyTask();
                    break;
                case 4:
                    tasks.findTask();
                    break;
                case 5:
                    tasks.showTasks();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number");
                    break;
            }
        }
    }
}
