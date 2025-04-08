package interfaces;

import enums.ComponentType;
import models.factory.AComponent;

public interface IComponentFactory {
    AComponent getComponent(ComponentType type, String identifier);
}
