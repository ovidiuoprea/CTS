package cts.subject3.models;

import cts.subject3.enums.PlayerType;

public class Training {
    PlayerType recommendedPlayerType;
    String name;

    public Training(PlayerType recommendedPlayerType, String name) {
        this.recommendedPlayerType = recommendedPlayerType;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Training{" +
                "recommendedPlayerType=" + recommendedPlayerType +
                ", name='" + name + '\'' +
                '}';
    }
}
