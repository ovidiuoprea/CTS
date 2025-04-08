package abstracts;

public abstract class AMedicalDevice implements Cloneable{
    private String identifier;

    public AMedicalDevice(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
