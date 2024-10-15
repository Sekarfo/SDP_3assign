package taskprocessing;

public class Main {
    public static void main(String[] args) {

        TaskHandler lowHandler = new LowPriorityHandler();
        TaskHandler mediumHandler = new MediumPriorityHandler();
        TaskHandler highHandler = new HighPriorityHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);




        // Task creation
        Task task1 = new Task("Task1", Task.Priority.LOW);
        Task task2 = new Task("Task2", Task.Priority.MEDIUM);
        Task task3 = new Task("Task3", Task.Priority.HIGH);

        System.out.println("Execution");
        // Command execution
        TaskCommand command1 = new ProcessTaskCommand(task1);
        command1.execute();
        TaskCommand command2 = new ProcessTaskCommand(task2);
        command2.execute();
        TaskCommand command3 = new ProcessTaskCommand(task3);
        command3.execute();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mediator");
        // Using the mediator
        TaskMediator mediator = new TaskProcessorMediator(lowHandler);
        mediator.sendTask(task2);
        mediator.sendTask(task3);


        System.out.println(" ");
        System.out.println(" ");

        // Using Iterator to traverse tasks
        TaskList taskList = new TaskList();
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        TaskIterator iterator = taskList.iterator();
        System.out.println("Traverse tasks");
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Traversing task: " + task.getName());
        }
    }
}

