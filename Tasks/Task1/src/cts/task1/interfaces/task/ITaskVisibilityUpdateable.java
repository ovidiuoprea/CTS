package cts.task1.interfaces.task;

import cts.task1.models.Task;

public interface ITaskVisibilityUpdateable {
    void updateTaskVisibility(Task task, Boolean isVisible);
}
