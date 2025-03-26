package cts.task1.models.user;

import cts.task1.interfaces.ITaskViewable;
import cts.task1.models.Task;
import cts.task1.models.TaskManager;

import java.util.List;

public class Admin extends User implements ITaskViewable {
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
}
