package taskprocessing;

import java.util.List;

public class TaskListIterator implements TaskIterator {
    private List<Task> tasks;
    private int position;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        if (this.hasNext()) {
            return tasks.get(position++);
        }
        return null;
    }
}
