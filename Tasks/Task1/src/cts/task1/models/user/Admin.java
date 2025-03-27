package cts.task1.models.user;

import cts.task1.interfaces.task.ITaskDeletable;
import cts.task1.interfaces.task.ITaskTitleUpdateable;
import cts.task1.interfaces.task.ITaskViewable;
import cts.task1.models.Task;
import cts.task1.models.TaskManager;

public class Admin extends User implements ITaskViewable, ITaskTitleUpdateable, ITaskDeletable {
    private TaskManager taskManager = TaskManager.getInstance();
    public Admin(String name) {
        super(name);
    }

    @Override
    public void viewTasks() {
        for(Task task : taskManager.getTasks()) {
            System.out.println(task);
        }
    }

    @Override
    public void updateTitle(Task task, String title) {
        ITaskTitleUpdateable.super.updateTitle(task, title);
    }

    @Override
    public void deleteTask(Task task) {
        ITaskDeletable.super.deleteTask(task);
    }
}
