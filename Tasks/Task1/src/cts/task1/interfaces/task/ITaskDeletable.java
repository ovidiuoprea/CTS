package cts.task1.interfaces.task;

import cts.task1.exceptions.TaskNotFoundException;
import cts.task1.models.Task;
import cts.task1.models.TaskManager;

import java.util.List;

public interface ITaskDeletable {
    default void deleteTask(Task task) {
        List<Task> tasks = TaskManager.getInstance().getTasks();
        if(!tasks.contains(task)) {
            throw new TaskNotFoundException();
        }
        else {
            tasks.remove(task);
        }
    }
}
