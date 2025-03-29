package cts.task1.models;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final TaskManager instance = new TaskManager();
    private List<Task> tasks = new ArrayList<>();

    private TaskManager() {}

    public static TaskManager getInstance() {
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
