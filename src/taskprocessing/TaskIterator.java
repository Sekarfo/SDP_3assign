package taskprocessing;

public interface TaskIterator {
    boolean hasNext();
    Task next();
}
