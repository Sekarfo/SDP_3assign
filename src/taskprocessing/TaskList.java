package taskprocessing;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Iterable<Task> {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public TaskIterator iterator() {
        return new TaskIteratorImpl();
    }

    private class TaskIteratorImpl implements TaskIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < tasks.size();
        }

        public Task next() {
            if (hasNext()) {
                return tasks.get(index++);
            }
            return null;
        }
    }
}