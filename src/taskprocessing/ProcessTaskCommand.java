package taskprocessing;

public class ProcessTaskCommand implements TaskCommand {
    private Task task;

    public ProcessTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + task.getName());
        task.process();
    }
}
