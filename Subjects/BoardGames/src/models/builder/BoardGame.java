package models.builder;

import java.util.List;

public class BoardGame {
    String title;
    int maxPlayers;
    int averageLength;
    List<String> components;
    boolean hasAIOpponent;
    boolean hasExtensions;
    boolean hasExtraGameModes;

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
}
