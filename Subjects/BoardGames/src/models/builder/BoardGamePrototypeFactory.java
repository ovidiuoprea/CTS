package models.builder;

import enums.BoardGameType;
import interfaces.IBoardGamePrototypeFactory;

import java.util.HashMap;
import java.util.stream.Stream;

public class BoardGamePrototypeFactory implements IBoardGamePrototypeFactory {
    private static HashMap<BoardGameType, BoardGame> boardGames = new HashMap<>();

    static {
        boardGames.put(
                BoardGameType.DECK_BUILDER,
                new BoardGameBuilder(
                        "Deck builder",
                        6,
                        70,
                        Stream.of(
                                "Board",
                                "Card"
                        ).toList())
                        .addExtensions()
                        .build()
        );

        boardGames.put(
                BoardGameType.DICE_COMBAT,
                new BoardGameBuilder(
                        "Deck builder",
                        3,
                        30,
                        Stream.of(
                                "Board",
                                "Dice"
                        ).toList())
                        .build()
        );
    }


    @Override
    public BoardGame getBoardGame(BoardGameType boardGameType) throws CloneNotSupportedException {
        if(boardGames.get(boardGameType) == null) {
            throw new RuntimeException("Could not find template for requested board game");
        }
        return (BoardGame) boardGames.get(boardGameType).clone();
    }
}
