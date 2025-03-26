package cts.task1.models.user;

import cts.task1.interfaces.ITaskViewable;
import cts.task1.interfaces.IUser;
import cts.task1.models.Task;
import cts.task1.models.TaskManager;

import java.util.List;

public abstract class User implements IUser, ITaskViewable {
    private String name;

    private TaskManager taskManager = TaskManager.getInstance();

    public User(String name) {
        this.name = name;
    }

    @Override
    public Task createTask(String name, String description, Boolean isVisible) {
        Task task = new Task(name, description, isVisible);
        taskManager.addTask(task);
        return task;
    }

    @Override
    public void viewTasks() {
        List<Task> visibleTasks = taskManager.getTasks().stream().filter((task -> task.getVisible() == true)).toList();
        for(Task task : visibleTasks) {
            System.out.println(task);
        }
    }
}
