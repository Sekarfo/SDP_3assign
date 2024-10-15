package taskprocessing;

public class HighPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Task.Priority.HIGH) {
            System.out.println("Processing high-priority task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
