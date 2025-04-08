package models.factory;

public abstract class AComponent {
    String identifier;


    protected AComponent(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "AComponent{" +
                "identifier='" + identifier + '\'' +
                '}';
    }


}
