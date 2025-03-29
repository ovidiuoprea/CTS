package cts.task3.serializers;

import cts.task3.models.ingredients.sauces.Sauce;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SauceSerializer {
    public static void write(List<Sauce> sauces, String filepath) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            for(Sauce sauce : sauces) {
                fileWriter.write(sauce.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
