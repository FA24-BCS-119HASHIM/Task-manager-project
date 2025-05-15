

public class User {
    private int userId;
    private String username;
    private String password; 
    private String email;
    private Task[] tasks;
    private int taskCount;
    private Project[] projects;
    private int projectCount;

    public User(int userId, String username, String password, String email, int maxTasks, int maxProjects) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.tasks = new Task[maxTasks]; // Fixed-size array for tasks
        this.taskCount = 0;
        this.projects = new Project[maxProjects]; // Fixed-size array for projects
        this.projectCount = 0;
    }

    public void addTask(Task task) {
        if (taskCount < tasks.length) {
            tasks[taskCount++] = task;
        } else {
            System.out.println("Task limit reached!");
        }
    }

    public void addProject(Project project) {
        if (projectCount < projects.length) {
            projects[projectCount++] = project;
        } else {
            System.out.println("Project limit reached!");
        }
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Number of Tasks: " + taskCount);
        System.out.println("Number of Projects: " + projectCount);
    }
}