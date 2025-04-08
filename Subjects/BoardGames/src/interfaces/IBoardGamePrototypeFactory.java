package interfaces;

import enums.BoardGameType;
import models.builder.BoardGame;

public interface IBoardGamePrototypeFactory {
    BoardGame getBoardGame(BoardGameType boardGameType) throws CloneNotSupportedException;
}
