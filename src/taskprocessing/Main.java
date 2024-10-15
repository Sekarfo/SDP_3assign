package taskprocessing;

public class Main {
    public static void main(String[] args) {

        TaskHandler lowHandler = new LowPriorityHandler();
        TaskHandler mediumHandler = new MediumPriorityHandler();
        TaskHandler highHandler = new HighPriorityHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);


        TaskCollection taskCollection = new TaskCollection();


        taskCollection.addTask(new Task("LowPriorityTask", Task.Priority.LOW));
        taskCollection.addTask(new Task("MediumPriorityTask", Task.Priority.MEDIUM));
        taskCollection.addTask(new Task("HighPriorityTask", Task.Priority.HIGH));


        TaskIterator iterator = taskCollection.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            System.out.println("Iterating over task: " + task.getName());


            lowHandler.handleTask(task);
        }
    }
}
