import cts.subject3.enums.PlayerType;
import cts.subject3.models.ProhibitedMedication;
import cts.subject3.models.player.PlayerPrototypeFactory;
import cts.subject3.models.Training;
import cts.subject3.models.player.Goalkeeper;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        try {
            Goalkeeper goalkeeper1 = (Goalkeeper) PlayerPrototypeFactory.getPlayer(PlayerType.GOALKEEPER);
            Goalkeeper goalkeeper2 = (Goalkeeper) PlayerPrototypeFactory.getPlayer(PlayerType.GOALKEEPER);

            System.out.println(goalkeeper1);
            System.out.println(goalkeeper2);

            goalkeeper1.addTrainingSession(new Training(PlayerType.GOALKEEPER, "One-on-one training"));
            System.out.println(goalkeeper1);
            System.out.println("Ensuring each player can have its own list of training sessions: ");
            System.out.println(goalkeeper2);

            String ibuprofenDopingResult = goalkeeper1.testForDoping("Ibuprofen", 240);
            System.out.println(ibuprofenDopingResult);

            String annabolicSteroidsDopingResult = goalkeeper1.testForDoping("Annabolic Steroids", 40);

            System.out.println(annabolicSteroidsDopingResult);

            goalkeeper1.addProhibitedMedication(new ProhibitedMedication("Ibuprofen", 20));
            String updatedIbuprofenDopingResult = goalkeeper1.testForDoping("Ibuprofen", 240);
            System.out.println(updatedIbuprofenDopingResult);

            System.out.println("Ensuring the list of prohibited medications is shared between all players: ");
            System.out.println(goalkeeper1);
            System.out.println(goalkeeper2);

        }
        catch (CloneNotSupportedException exception) {
            System.out.println("Could not get player due to: " + exception.getMessage());
        }

    }
}