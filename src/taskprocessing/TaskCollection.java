package taskprocessing;

import java.util.ArrayList;
import java.util.List;

public class TaskCollection {
    private List<Task> tasks;

    public TaskCollection() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public TaskIterator iterator() {
        return new TaskListIterator(tasks);
    }
}
