import enums.PlatformServiceType;
import models.builder.BoardGame;
import models.builder.BoardGameBuilder;
import models.singleton.PlatformServiceManager;

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

    }
}