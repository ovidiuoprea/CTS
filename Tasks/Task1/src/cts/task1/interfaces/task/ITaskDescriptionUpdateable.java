package cts.task1.interfaces.task;

import cts.task1.models.Task;

public interface ITaskDescriptionUpdateable {
    default void updateDescription(Task task, String description) {
        task.setDescription(description);
    }
}
