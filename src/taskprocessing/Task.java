package taskprocessing;

public class Task {
    public enum Priority {LOW, MEDIUM, HIGH}

    private String name;
    private Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void process() {
        System.out.println("Task " + name + " is being processed.");
    }
}
