package models.builder;

import interfaces.IBoardGameBuilder;

import java.util.List;

public class BoardGameBuilder implements IBoardGameBuilder {
    BoardGame boardGame;

    // Additional requirement:
    // Daca jocul are jetoane, durata medie minima este 30 de minute.
    // Altfel, durata medie minima este 10 minute.
    public BoardGameBuilder(String title, int maxPlayers, int averageLength, List<String> components) {
        for(String component : components) {
            if(component.toLowerCase().equals("jetoane")) {
                if(averageLength < 30) {
                    averageLength = 30;
                }
            }
        }
        if(averageLength < 10) {
            averageLength = 10;
        }


        boardGame = new BoardGame(title, maxPlayers, averageLength, components);
    }

    public BoardGameBuilder addAIOpponent() {
        boardGame.setHasAIOpponent(true);
        return this;
    }

    // TODO: Rename this:
    public BoardGameBuilder addExtraGameModes() {
        boardGame.setHasExtraGameModes(true);
        return this;
    }

    // TODO: Rename this:
    public BoardGameBuilder addExtensions() {
        // Additional requirement:
        // If the game has less than 6 players, we can't have extensions.
        if(boardGame.maxPlayers >= boardGame.EXTENSIONS_MINIMUM_PLAYERS_COUNT){
            boardGame.setHasExtensions(true);
        }
        else {
            System.out.println("Cannot have extensions if the player count < 6");
        }
        return this;
    }

    @Override
    public BoardGame build() {
        return boardGame;
    }
}
