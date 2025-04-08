package models.factory;

import enums.ComponentType;
import exceptions.ComponentTypeNotFound;
import interfaces.IComponentFactory;

public class ComponentFactory implements IComponentFactory {

    @Override
    public AComponent getComponent(ComponentType type, String identifier) {
        switch (type) {
            case ComponentType.BOARD:
                return new Board(identifier);
            case ComponentType.DICE:
                return new Dice(identifier);
            case ComponentType.CARD:
                return new Card(identifier);
            case ComponentType.TOKEN:
                return new Token(identifier);
            default:
                throw new ComponentTypeNotFound();
        }
    }
}
