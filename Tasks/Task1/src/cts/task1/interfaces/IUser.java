package cts.task1.interfaces;

import cts.task1.models.Task;

public interface IUser {
    Task createTask(String name, String description, Boolean isVisible);
    void filterTaskByTitle(String title);
}
