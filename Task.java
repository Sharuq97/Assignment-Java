// Task class inherits from BaseTask
public class Task extends BaseTask {

    // Constructor that calls the superclass constructor - super()
    public Task(int id, String description, boolean isComplete, int urgency, double estimatedTime) {
        super(id, description, isComplete, urgency, estimatedTime);
    }

    // Overriding the abstract method from BaseTask 
    @Override
    public void display() {
        // This shows the task details including integer, string, boolean, and double fields
        System.out.println("ID: " + getId() + ", Description: " + getDescription() +
                ", Complete: " + isComplete() + ", Urgency: " + getUrgency() +
                ", Estimated Time: " + getEstimatedTime() + " hours");
    }
}
