package cts.task1.models;

public class Task {
    private String title;
    private String description;
    private static Integer id = 0;
    Boolean isVisible;

    public Task(String title, String description, boolean isVisible) {
        this.title = title;
        this.description = description;
        this.isVisible = true;
        id++;
    }

    public Task() {
        id++;
    }
}
