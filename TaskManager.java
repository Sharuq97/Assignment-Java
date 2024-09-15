// Interface defining CRUD operations (Requirement: Must have at least one interface or abstract class)
public interface TaskManager {
    // Methods accepting multiple parameters (Requirement: At least 2 methods with parameters)
    void createTask(int id, String description, boolean isComplete, int urgency, double estimatedTime);
    Task readTask(int id);
    void updateTask(int id, String description, boolean isComplete, int urgency, double estimatedTime);
    void deleteTask(int id);
}
