package duke.taskmanagement;

/**
 * Event represents a task with a specific event duration, which is a subtype of Task.
 * It contains information about the task's description, event start time, event end time,
 * and completion status.
 */
public class Event extends Task {
    protected String from;
    protected String till;

    /**
     * Constructor for the Event class.
     *
     * @param description The description of the event task.
     * @param from        The start time of the event.
     * @param till        The end time of the event.
     * @param isDone      A boolean indicating whether the task is done or not.
     */
    public Event(String description, String from, String till, boolean isDone) {
        super(description, isDone);
        this.from = from;
        this.till = till;
    }

    /**
     * Return the status icon of whether the task is done or not
     * @return A string that represent of status of the task, [X] if done,
     * [ ] if not done.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + from + " to: " + till + ")";
    }

    /**
     * Returns the indication of status of the task by using
     * "1" and "0" to store it in duke.txt.
     * @return "1" if the task is done and "0" if the task is not done.
     */
    public String convertIsDone() {
        return super.isDone ? "1" : "0";
    }

    /**
     * Returns the string with the correct format to store in duke.txt
     * @return String representation of the task to store in duke.txt.
     */
    @Override
    public String saveToFileString() {
        return "E | " +  convertIsDone() + " | " + description + " | " + this.from + " | " + this.till +"\n";
    }
}
