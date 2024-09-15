import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate TaskManager implementation (Requirement: Class instantiation)
        TaskManagerImpl taskManager = new TaskManagerImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // While loop to keep the program running until exit is chosen (Requirement: At least 2 loops)
        while (running) {
            // Command-line interface to select operations (Requirement: Usable command-line interface)
            System.out.println("Choose an option: ");
            System.out.println("1. Create Task");
            System.out.println("2. Read Task");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Display All Tasks");
            System.out.println("6. Exit");

            // Get user input for operation choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Handle different CRUD operations (Requirement: At least 2 if/else or if/else if)
            switch (choice) {
                case 1:
                    // Create a task
                    System.out.println("Enter task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.println("Is the task complete (true/false)? ");
                    boolean isComplete = scanner.nextBoolean();
                    System.out.println("Enter task urgency (1-5): ");
                    int urgency = scanner.nextInt();
                    System.out.println("Enter estimated time to complete (in hours): ");
                    double estimatedTime = scanner.nextDouble();
                    taskManager.createTask(id, description, isComplete, urgency, estimatedTime);
                    break;

                case 2:
                    // Read a task
                    System.out.println("Enter task ID to read: ");
                    id = scanner.nextInt();
                    Task task = taskManager.readTask(id);
                    if (task != null) {
                        task.display();
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    // Update a task
                    System.out.println("Enter task ID to update: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new task description: ");
                    description = scanner.nextLine();
                    System.out.println("Is the task complete (true/false)? ");
                    isComplete = scanner.nextBoolean();
                    System.out.println("Enter new task urgency (1-5): ");
                    urgency = scanner.nextInt();
                    System.out.println("Enter new estimated time to complete (in hours): ");
                    estimatedTime = scanner.nextDouble();
                    taskManager.updateTask(id, description, isComplete, urgency, estimatedTime);
                    break;

                case 4:
                    // Delete a task
                    System.out.println("Enter task ID to delete: ");
                    id = scanner.nextInt();
                    taskManager.deleteTask(id);
                    break;

                case 5:
                    // Display all tasks (Requirement: For loop and task display)
                    taskManager.displayAllTasks();
                    break;

                case 6:
                    // Exit program
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
