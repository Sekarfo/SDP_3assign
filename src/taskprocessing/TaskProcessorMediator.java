package taskprocessing;

public class TaskProcessorMediator implements TaskMediator {
    private TaskHandler handler;

    public TaskProcessorMediator(TaskHandler handler) {
        this.handler = handler;
    }

    public void sendTask(Task task) {
        handler.handleTask(task);
    }
}
