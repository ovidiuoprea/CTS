package cts.task1.models.user;

import cts.task1.interfaces.IUser;
import cts.task1.models.Task;

public abstract class User implements IUser {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public Task createTask(String name, String description) {
        return new Task(name, description);
    }
}
