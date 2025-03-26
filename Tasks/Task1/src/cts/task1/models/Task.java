package cts.task1.models;

public class Task {
    private String title;
    private String description;
    private static Integer id = 0;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        id++;
    }

    public Task() {
        id++;
    }
}
