package cts.subject2.models.builder;

import cts.subject2.exceptions.GlassDecorationsNotSupportedException;
import cts.subject2.exceptions.NotEnoughEntrancesException;
import cts.subject2.models.decoration.ADecoration;
import cts.subject2.models.decoration.GlassDecoration;
import cts.subject2.models.floor.AFloor;
import cts.subject2.models.floor.DefaultConcreteFloor;

public class StoreBuilder extends AStoreBuilder{
    private Store store;

    public StoreBuilder(String name, float area) {
        // If the number of entrances are not set, the store will use a default value of 1 (ensuring the restrictions are matched?)
        // Restriction: there can be no less than one entrance per 100sqm
        // I don't understand how I can use a default value of 1 and match the restrictions, so I'll just match the restrictions:

        // Minimum number of entrances for the selected area:
        final int numberOfEntrances = (int) Math.max(Math.floor(area / 100), 1);

        this.store = new Store(name, area, numberOfEntrances);

        // If the customer does not choose a special flooring, the store will use the default one:
        this.store.setFloor(new DefaultConcreteFloor());
    }


    @Override
    public AStoreBuilder addFloor(AFloor floor) {
        this.store.setFloor(floor);
        return this;
    }

    @Override
    public AStoreBuilder addDecoration(ADecoration decoration) {
        // Daca duritatea podelei este moale, nu se pot adauga decoratiuni din sticla
        if(decoration instanceof GlassDecoration) {
            if(this.store.floor.getHardness() < 2) {
                throw new GlassDecorationsNotSupportedException();
            }
        }
        this.store.addDecoration(decoration);
        return this;
    }

    @Override
    public AStoreBuilder addNumberOfEntrances(int numberOfEntrances) {
        final int minimumNumberOfEntrances = (int) Math.max(Math.floor(store.area / 100), 1);
        if(numberOfEntrances < minimumNumberOfEntrances) {
            throw new NotEnoughEntrancesException();
        }
        this.store.setNumberOfEntrances(numberOfEntrances);
        return this;
    }

    @Override
    public Store build() {
        return store;
    }
}
