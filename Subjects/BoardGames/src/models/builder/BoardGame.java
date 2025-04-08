package models.builder;

import models.factory.AComponent;

import java.util.ArrayList;
import java.util.List;

public class BoardGame implements Cloneable {
    String title;
    int maxPlayers;
    int averageLength;
    List<String> components;
    boolean hasAIOpponent;
    boolean hasExtensions;
    boolean hasExtraGameModes;

    List<AComponent> newComponents;

    public final int EXTENSIONS_MINIMUM_PLAYERS_COUNT = 6;

    BoardGame(String title, int maxPlayers, int averageLength, List<String> components) {
        this.title = title;
        this.maxPlayers = maxPlayers;
        this.averageLength = averageLength;
        this.components = components;
    }

    void setHasAIOpponent(boolean hasAIOpponent) {
        this.hasAIOpponent = hasAIOpponent;
    }

    void setHasExtensions(boolean hasExtensions) {
        this.hasExtensions = hasExtensions;
    }

    void setHasExtraGameModes(boolean hasExtraGameModes) {
        this.hasExtraGameModes = hasExtraGameModes;
    }

    public void addNewComponent(String component) {
        components.add(component);
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "title='" + title + '\'' +
                ", maxPlayers=" + maxPlayers +
                ", averageLength=" + averageLength +
                ", components=" + components +
                ", hasAIOpponent=" + hasAIOpponent +
                ", hasExtensions=" + hasExtensions +
                ", hasExtraGameModes=" + hasExtraGameModes +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BoardGame cloned = (BoardGame) super.clone();
        List<String> clonedComponents = new ArrayList<>();
        for(String component : components) {
            clonedComponents.add(component);
        }
        cloned.components = clonedComponents;
        return cloned;
    }
}
