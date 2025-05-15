import java.util.Date;

public class ProjectTask extends Task {
    private int projectId;

    // Constructor
    public ProjectTask(int taskId, String title, String description, Date dueDate, String priority, int projectId) {
        super(taskId, title, description, dueDate, priority);
        this.projectId = projectId;
    }

    // Getter for projectId
    public int getProjectId() {
        return projectId;
    }

    // Setter for projectId
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    // Override displayTaskDetails to include projectId
    @Override
    public void displayTaskDetails() {
        super.displayTaskDetails(); // Call the parent class method
        System.out.println("Project ID: " + projectId);
    }
}