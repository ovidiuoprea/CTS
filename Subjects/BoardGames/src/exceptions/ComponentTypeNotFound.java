package exceptions;

public class ComponentTypeNotFound extends RuntimeException {
    public ComponentTypeNotFound() {
        super("Component type not found");
    }
}
