public class Project {
    private int projectId;
    private String projectName;
    private String projectDescription;
    private Task[] tasks;
    private int taskCount;

    public Project(int projectId, String projectName, String projectDescription, int maxTasks) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.tasks = new Task[maxTasks];
        this.taskCount = 0;
    }

    public int getProjectId() {
        return projectId;
    }

    public void addTask(Task task) {
        if (taskCount < tasks.length) {
            tasks[taskCount++] = task;
        } else {
            System.out.println("Task limit reached!");
        }
    }

    public void displayProjectDetails() {
        System.out.println("Project ID: " + projectId);
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Description: " + projectDescription);
        System.out.println("Number of Tasks: " + taskCount);

        if (taskCount > 0) {
            System.out.println("Tasks:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println(" Task " + (i + 1) + ":");
                tasks[i].displayTaskDetails();
                System.out.println("--------------------");
            }
        } else {
            System.out.println("No tasks in this project.");
        }
    }
}