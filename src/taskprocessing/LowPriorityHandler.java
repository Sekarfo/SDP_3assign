package taskprocessing;

public class LowPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Task.Priority.LOW) {
            System.out.println("Processing low-priority task: " + task.getName());
        } else if (nextHandler != null) {
            System.out.println("send to Medium");
            nextHandler.handleTask(task);
        }
    }
}
