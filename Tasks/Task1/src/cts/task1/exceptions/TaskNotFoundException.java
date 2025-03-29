package cts.task1.exceptions;

public class TaskNotFoundException extends RuntimeException {
    private static final String TASK_NOT_FOUND_MESSAGE = "Could not find requested task in the task manager!";
    public TaskNotFoundException() {
        super(TASK_NOT_FOUND_MESSAGE);
    }
}
