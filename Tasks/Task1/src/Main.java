import cts.task1.models.Task;
import cts.task1.models.user.Admin;
import cts.task1.models.user.RegularUser;
import cts.task1.models.user.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("CTS Lab - Task 1");

        User admin = new Admin("Admin");
        User regular = new RegularUser("Regular user");

        Task task1 = regular.createTask("Task1", "First task created", false);
        Task task2 = admin.createTask("Task2", "Second task created", true);
        Task task3 = admin.createTask("Task3", "Third task created", false);

        regular.changeTaskVisibility(task3, true);

        System.out.println("\n\nAdmin view tasks:\n");
        admin.viewTasks();

        System.out.println("\n\nRegular view tasks:\n");
        regular.viewTasks();
    }
}