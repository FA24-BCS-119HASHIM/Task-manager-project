

import java.util.Date;

public class Task {
    private int taskId;
    private String title;
    private String description;
    private Date dueDate;
    private String priority;

    public Task(int taskId, String title, String description, Date dueDate, String priority) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public void displayTaskDetails() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Priority: " + priority);
    }
}