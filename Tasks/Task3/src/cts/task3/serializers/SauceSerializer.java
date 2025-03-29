package cts.task3.serializers;

import cts.task3.models.ingredients.Ingredient;
import cts.task3.models.ingredients.sauces.FermentingSauce;
import cts.task3.models.ingredients.sauces.Sauce;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SauceSerializer {
    public static void write(List<Sauce> sauces, String filepath) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            for(Sauce sauce : sauces) {
                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(sauce.getCalories() + ",");
                stringBuilder.append(sauce.getName() + ",");
                stringBuilder.append(sauce.getSpicy());

                if(sauce instanceof FermentingSauce) {
                    stringBuilder.append("," + ((FermentingSauce)sauce).getExpiryHours());
                }
                stringBuilder.append("\n");

                fileWriter.write(stringBuilder.toString());
            }
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
