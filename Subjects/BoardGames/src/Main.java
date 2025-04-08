import enums.BoardGameType;
import enums.ComponentType;
import enums.PlatformServiceType;
import models.builder.BoardGame;
import models.builder.BoardGameBuilder;
import models.builder.BoardGamePrototypeFactory;
import models.factory.Board;
import models.factory.ComponentFactory;
import models.factory.Dice;
import models.singleton.PlatformServiceManager;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        PlatformServiceManager scoringManager = PlatformServiceManager.getInstance(PlatformServiceType.SCORING);
        PlatformServiceManager moveHistoryManager = PlatformServiceManager.getInstance(PlatformServiceType.MOVE_HISTORY);
        PlatformServiceManager rulesValidationManager = PlatformServiceManager.getInstance(PlatformServiceType.RULES_VALIDATION);

        PlatformServiceManager scoringManager2 = PlatformServiceManager.getInstance(PlatformServiceType.SCORING);

        if(!scoringManager.equals(scoringManager2)) {
            throw new RuntimeException("Instantele nu sunt la fel");
        }

        System.out.println(scoringManager);
        System.out.println(scoringManager2);

        BoardGame boardGame = new BoardGameBuilder(
                "Board game 1",
                4,
                10,
                Stream.of(
                        "Cards",
                        "Dice",
                        "Tokens"
                ).toList()
        ).build();

        System.out.println(boardGame);

        ComponentFactory componentFactory = new ComponentFactory();
        Dice dice = (Dice) componentFactory.getComponent(ComponentType.DICE, "Primul meu zar");
        Board board = (Board) componentFactory.getComponent(ComponentType.BOARD, "Prima mea tabla");

        System.out.println(dice + "\n" + board);

        List<String> chessComponents = Stream.of(
                "Pieces",
                "Board"
        ).collect(Collectors.toList());

        BoardGame chess = new BoardGameBuilder(
                "Chess",
                2,
                10,
                chessComponents
                ).build();
        System.out.println("Original chess: " + chess);

        try {
            BoardGame chessClone = (BoardGame) chess.clone();
            chessClone.addNewComponent("Dice");
            System.out.println("Cloned chess: " + chessClone);
            System.out.println("After changing the clone, the original chess: " + chess);

            BoardGamePrototypeFactory boardGamePrototypeFactory = new BoardGamePrototypeFactory();
            BoardGame diceCombat = boardGamePrototypeFactory.getBoardGame(BoardGameType.DICE_COMBAT);

            System.out.println(diceCombat);

            BoardGame tilePlacement = boardGamePrototypeFactory.getBoardGame(BoardGameType.TILE_PLACEMENT);
        }
        catch(CloneNotSupportedException exception) {
            System.out.println("Could not clone game due to " + exception.getMessage());
        }
        catch(RuntimeException exception) {
            System.out.println("Could not run game due to " + exception.getMessage());
        }
    }
}