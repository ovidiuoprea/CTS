package cts.task1.models.user;

import cts.task1.interfaces.task.ITaskViewable;
import cts.task1.interfaces.task.ITaskVisibilityUpdateable;
import cts.task1.interfaces.IUser;
import cts.task1.models.Task;
import cts.task1.models.TaskManager;

import java.util.List;

public abstract class User implements IUser, ITaskViewable, ITaskVisibilityUpdateable {
    private String name;

    private TaskManager taskManager = TaskManager.getInstance();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Task createTask(String name, String description, Boolean isVisible) {
        Task task = new Task(name, description, isVisible, this);
        taskManager.addTask(task);
        return task;
    }

    @Override
    public void viewTasks() {
        List<Task> visibleTasks = taskManager.getTasks().stream().filter(Task::getVisible).toList();
        for(Task task : visibleTasks) {
            System.out.println(task);
        }
    }

    @Override
    public void updateTaskVisibility(Task task, Boolean isVisible) {
        task.setVisible(isVisible);
    }

    @Override
    public void filterTaskByTitle(String title) {
        List<Task> filteredTasks = taskManager
                .getTasks()
                .stream()
                .filter(
                    task -> task.getTitle().toLowerCase().contains(title.toLowerCase().trim())
                )
                .toList();

        for(Task task : filteredTasks) {
            System.out.println(task);
        }
    }
}
