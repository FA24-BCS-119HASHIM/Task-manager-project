
import java.util.Date;

public class PersonalTask extends Task {
    private boolean reminder;

    public PersonalTask(int taskId, String title, String description, Date dueDate, String priority, boolean reminder) {
        super(taskId, title, description, dueDate, priority);
        this.reminder = reminder;
    }

    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    public boolean getReminder() {
        return reminder;
    }

    public void displayPersonalTaskDetails() {
        displayTaskDetails();
        System.out.println("Reminder Set: " + reminder);
    }
}