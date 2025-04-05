package cts.task.practice.models.prototype;

public class OS implements Cloneable {
    int version = 0;

    public OS(int version) throws InterruptedException {
        this.version = version;
        System.out.println("Building the OS v" + this.version + ".");
        Thread.sleep(5000);
        System.out.println("OS build finished.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Since we don't have any fields that need deep copy, this is enough:
        return super.clone();
    }

    @Override
    public String toString() {
        return "OS{" +
                "version=" + version +
                '}';
    }
}
