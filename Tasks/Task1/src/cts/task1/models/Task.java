package cts.task1.models;

import cts.task1.models.user.User;

public class Task {
    private String title;
    private String description;
    private static Integer id = 0;
    Boolean isVisible;
    User owner;

    public Task(String title, String description, boolean isVisible, User owner) {
        this.title = title;
        this.description = description;
        this.isVisible = isVisible;
        this.owner = owner;
        id++;
    }

    public Task() {
        id++;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isVisible=" + isVisible +
                ", owner=" + owner.getName() +
                '}';
    }
}
