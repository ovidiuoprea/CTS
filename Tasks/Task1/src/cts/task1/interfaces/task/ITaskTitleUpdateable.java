package cts.task1.interfaces.task;

import cts.task1.models.Task;

public interface ITaskTitleUpdateable {
    default void updateTitle(Task task, String title) {
        task.setTitle(title);
    };
}
