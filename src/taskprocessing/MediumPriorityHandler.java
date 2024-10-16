package taskprocessing;

public class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == Task.Priority.MEDIUM) {
            System.out.println("Processing medium-priority task: " + task.getName());
        } else if (nextHandler != null) {
            System.out.println("send to high");
            nextHandler.handleTask(task);
        }
    }
}
