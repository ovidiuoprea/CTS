import enums.PlatformServiceType;
import models.singleton.PlatformServiceManager;

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


    }
}