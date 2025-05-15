import java.util.Date;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a User
        User user = new User(1, "Hashim", "securepassword", "hashim@example.com", 10, 5);
        System.out.println("User created successfully!");

        // Create a Task
        System.out.println("\nCreating a new task...");
        Task task1 = new Task(101, "Complete Assignment", "Finish OOP project", new Date(), "High");
        user.addTask(task1);
        System.out.println("Task added to user's list.");

        // Create a Personal Task
        System.out.println("\nCreating a personal task...");
        PersonalTask personalTask = new PersonalTask(102, "Buy groceries", "Get vegetables and fruits", new Date(), "Medium", true);
        user.addTask(personalTask);
        System.out.println("Personal task added to user's list.");

        // Create a Project
        System.out.println("\nCreating a project...");
        Project project = new Project(201, "Task Manager", "Java OOP-based task management system", 10);
        user.addProject(project);
        System.out.println("Project added to user's list.");

        // Add Task to Project
        System.out.println("\nAdding a task to the project...");
        ProjectTask projectTask = new ProjectTask(103, "Design Database", "Create database schema for task manager", new Date(), "High", project.getProjectId());
        project.addTask(projectTask);
        System.out.println("Task added to the project.");

        // Display user details
        System.out.println("\nUser Details:");
        user.displayUserDetails();

        // Display project details
        System.out.println("\nProject Details:");
        project.displayProjectDetails();

        // Display all tasks
        System.out.println("\nTasks:");
        for (Task t : user.getTasks()) {
            if (t != null) { // Check if the task is not null
                t.displayTaskDetails();
                System.out.println("--------------------");
            }
        }

        scanner.close();
    }
}