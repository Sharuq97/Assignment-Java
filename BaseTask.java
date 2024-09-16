// Abstract class to demonstrate inheritance and abstraction
public abstract class BaseTask {
    private int id; // Integer 
    private String description; // String
    private boolean isComplete; // Boolean
    private int urgency; // Integer 
    private double estimatedTime; // Double

    // Constructor to initialize the task with parameters (Requirement: At least 2 methods that accept parameters)
    public BaseTask(int id, String description, boolean isComplete, int urgency, double estimatedTime) {
        this.id = id;
        this.description = description;
        this.isComplete = isComplete;
        this.urgency = urgency;
        this.estimatedTime = estimatedTime;
    }

    // Getters and setters for each field 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    // Abstract method to be overridden 
    public abstract void display();

    // Concrete method that can be inherited
    public void markComplete() {
        this.isComplete = true;
    }
}
