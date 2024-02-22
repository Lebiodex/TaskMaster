import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks extends Task {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Task> tasksList;

    public Tasks() {
        super();
        tasksList = new ArrayList<>();
    }

    public void showTasks() {

        if (tasksList.isEmpty()) {
            System.out.println("No added tasks");
        } else {
            for (Task task : tasksList) {
                System.out.println("Title: " + task.getTitle() + ", Category: " + task.getCategory() + ", Priority: " + " Deadline: " + task.getDeadline());
                // Sorting by priority
            }
        }
    }

    public void addTask(Task task){
        tasksList.add(task);
        showTasks();
    }

    public void createTask () {

        Scanner tasksScanner = new Scanner(System.in);

        System.out.println("Enter title of your task");
        String title = tasksScanner.next();
        System.out.println("Enter category of your task");
        String category = tasksScanner.next();
        System.out.println("Enter priority of your task (From 1 to 5 (1 is the most important))");
        int priority = tasksScanner.nextInt();
        System.out.println("Enter end time of your task ( hour:minute:second )");
        LocalTime deadline = LocalTime.parse(tasksScanner.next());
        addTask(new Task(title, category, priority, deadline));
        System.out.println("Task successfully created");
    }

    public void removeTask () {

        if (tasksList.isEmpty()) {
            System.out.println("No task can be deleted");
        } else {

            System.out.println("Enter the title of the task you would like to delete: ");
            String remove_title = scanner.next();

            tasksList.removeIf(task -> task.getTitle().equals(remove_title));

            System.out.println("Operation completed!");
            showTasks();
        }
    }

    public void modifyTask() {

        if (tasksList.isEmpty()) {
            System.out.println("No task can be modified");
        } else {
            System.out.println("Enter the title of the task you would like to delete: ");
            String title_to_modify = scanner.next();

            for (Task value : tasksList) {
                if (title_to_modify.equals(getTitle())) {

                    System.out.println("Enter new title of your task");
                    String modified_title = scanner.next();
                    if (modified_title.equals(getTitle())) {
                        removeTask();
                    } else {
                        System.out.println("No task can be modified");
                    }
                    System.out.println("Enter new category of your task");
                    String modified_category = scanner.next();
                    System.out.println("Enter new priority of your task");
                    int modified_priority = scanner.nextInt();
                    System.out.println("Enter new deadline of your task");
                    LocalTime modified_deadline = LocalTime.parse(scanner.next());
                    addTask(new Task(modified_title, modified_category, modified_priority, modified_deadline));

                }
            }
        }
    }

    public void findTask () {
        System.out.println("Type name of task that you want to find");
        String find_task = scanner.next();
        for (Task task : tasksList) {
            if (find_task.equals(task.getTitle())) {
                System.out.println("Title: " + task.getTitle() + " Category: " + task.getCategory() + " Priority: " + task.getPriority() + " Deadline: " + task.getDeadline());
            }
        }
    }
}