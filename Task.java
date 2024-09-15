// Task class inherits from BaseTask (Requirement: Demonstrates inheritance)
public class Task extends BaseTask {

    // Constructor that calls the superclass constructor (Requirement: Uses super())
    public Task(int id, String description, boolean isComplete, int urgency, double estimatedTime) {
        super(id, description, isComplete, urgency, estimatedTime);
    }

    // Overriding the abstract method from BaseTask (Requirement: Must override at least one method)
    @Override
    public void display() {
        // Display task details including integer, string, boolean, and double fields
        System.out.println("ID: " + getId() + ", Description: " + getDescription() +
                ", Complete: " + isComplete() + ", Urgency: " + getUrgency() +
                ", Estimated Time: " + getEstimatedTime() + " hours");
    }
}
