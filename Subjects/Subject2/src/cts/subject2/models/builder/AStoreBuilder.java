package cts.subject2.models.builder;

import cts.subject2.models.decoration.ADecoration;
import cts.subject2.models.floor.AFloor;

public abstract class AStoreBuilder {
    public abstract AStoreBuilder addFloor(AFloor floor);
    public abstract AStoreBuilder addDecoration(ADecoration decoration);
    public abstract AStoreBuilder addNumberOfEntrances(int numberOfEntrances);
    public abstract Store build();
}
