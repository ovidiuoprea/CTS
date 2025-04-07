package cts.subject3.models.player;

import cts.subject3.abstracts.APlayer;
import cts.subject3.enums.PlayerType;
import cts.subject3.models.Training;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class PlayerPrototypeFactory {
    private static HashMap<PlayerType, APlayer> players = new HashMap<>();
    private static final List<Training> GOALKEEPER_DEFAULT_TRAININGS = Stream.of(
            new Training(PlayerType.GOALKEEPER, "Penalty blocking"),
            new Training(PlayerType.GOALKEEPER, "Free kick blocking"),
            new Training(PlayerType.GOALKEEPER, "Goal kick training")
            ).toList();

    private static final List<Training> MIDFIELDER_DEFAULT_TRAININGS = Stream.of(
            new Training(PlayerType.MIDFIELDER, "Possession keeping"),
            new Training(PlayerType.MIDFIELDER, "Short passing"),
            new Training(PlayerType.MIDFIELDER, "Long passing")
    ).toList();

    private static final List<Training> FORWARD_DEFAULT_TRAININGS = Stream.of(
            new Training(PlayerType.FORWARD, "Striking"),
            new Training(PlayerType.FORWARD, "Penalty kicks"),
            new Training(PlayerType.FORWARD, "Dribbling")
    ).toList();

    static {
        players.put(
                PlayerType.GOALKEEPER,
                new Goalkeeper("Goalkeeper", 18, GOALKEEPER_DEFAULT_TRAININGS)
        );

        players.put(
                PlayerType.MIDFIELDER,
                new Midfielder("Midfielder", 18, MIDFIELDER_DEFAULT_TRAININGS)
        );

        players.put(
                PlayerType.FORWARD,
                new Forward("Forward", 18, FORWARD_DEFAULT_TRAININGS)
        );
    }

    public static APlayer getPlayer(PlayerType playerType) throws CloneNotSupportedException {
        return switch (playerType) {
            case GOALKEEPER -> (APlayer) players.get(PlayerType.GOALKEEPER).clone();
            case MIDFIELDER -> (APlayer) players.get(PlayerType.MIDFIELDER).clone();
            case FORWARD -> (APlayer) players.get(PlayerType.FORWARD).clone();
        };
    }
}
