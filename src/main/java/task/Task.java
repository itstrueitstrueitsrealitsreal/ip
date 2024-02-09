package task;

import util.CsvUtil;

import java.time.LocalDateTime;

/**
 * Represents a task.
 */
public abstract class Task {
    protected final String description;
    protected boolean isMarked;
    protected LocalDateTime startDate;

    /**
     * Constructs a task with the given description.
     *
     * @param description The description of the task.
     */
    Task(String description) {
        this.description = description;
        this.isMarked = false;
        this.startDate = null;
    }

    /**
     * Constructs a task with the given marked status and description.
     *
     * @param isMarked    The marked status of the task.
     * @param description The description of the task.
     */
    Task(boolean isMarked, String description, LocalDateTime startDate) {
        this.description = description;
        this.isMarked = isMarked;
        this.startDate = startDate;
    }

    public Task(String description, LocalDateTime startDate) {
        this.description = description;
        this.isMarked = false;
        this.startDate = startDate;
    }

    /**
     * Marks the task as completed.
     *
     * @return The updated task object.
     */
    public Task mark() {
        this.isMarked = true;
        return this;
    }

    /**
     * Marks the task as incomplete.
     *
     * @return The updated task object.
     */
    public Task unmark() {
        this.isMarked = false;
        return this;
    }

    /**
     * Formats the task into a CSV format.
     *
     * @return The formatted task as a CsvUtil object.
     */
    public abstract CsvUtil format();

    /**
     * Returns a string representation of the task.
     *
     * @return The string representation of the task.
     */
    @Override
    public String toString() {
        String check = isMarked ? "X" : " ";
        return String.format("[%s] %s", check, description);
    }

    public boolean contains(String s) {
        return this.description.contains(s);
    }

    public LocalDateTime getDateTime() {
        return this.startDate;
    }
}
