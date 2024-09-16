// Interface defining CRUD operations 
public interface TaskManager {
    // Methods accepting multiple parameters 
    void createTask(int id, String description, boolean isComplete, int urgency, double estimatedTime);
    Task readTask(int id);
    void updateTask(int id, String description, boolean isComplete, int urgency, double estimatedTime);
    void deleteTask(int id);
}
