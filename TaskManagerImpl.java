import java.util.HashMap;
import java.util.Map;

// TaskManagerImpl implements TaskManager interface (Requirement: Interface implementation)
public class TaskManagerImpl implements TaskManager {
    // Map to store tasks by ID (Requirement: At least one array or collection)
    private Map<Integer, Task> taskMap = new HashMap<>();

    // Create a task (Requirement: CRUD operations)
    @Override
    public void createTask(int id, String description, boolean isComplete, int urgency, double estimatedTime) {
        // Instantiate and store Task object
        Task task = new Task(id, description, isComplete, urgency, estimatedTime);
        taskMap.put(id, task);
    }

    // Read a task by ID (Requirement: CRUD operations)
    @Override
    public Task readTask(int id) {
        return taskMap.get(id);
    }

    // Update an existing task (Requirement: CRUD operations)
    @Override
    public void updateTask(int id, String description, boolean isComplete, int urgency, double estimatedTime) {
        Task task = taskMap.get(id);
        if (task != null) {
            // Set new values for the task (Requirement: Methods accepting parameters)
            task.setDescription(description);
            task.setComplete(isComplete);
            task.setUrgency(urgency);
            task.setEstimatedTime(estimatedTime);
        }
    }

    // Delete a task by ID (Requirement: CRUD operations)
    @Override
    public void deleteTask(int id) {
        taskMap.remove(id);
    }

    // Display all tasks in the taskMap (Requirement: For loop)
    public void displayAllTasks() {
        for (Task task : taskMap.values()) {
            task.display();
        }
    }
}
