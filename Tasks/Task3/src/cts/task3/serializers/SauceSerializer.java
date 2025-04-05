package cts.task3.serializers;

import cts.task3.models.ingredients.Ingredient;
import cts.task3.models.ingredients.sauces.FermentingSauce;
import cts.task3.models.ingredients.sauces.NonFermentingSauce;
import cts.task3.models.ingredients.sauces.Sauce;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SauceSerializer {
    public static void write(List<Sauce> sauces, String filepath) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            for(Sauce sauce : sauces) {
                StringBuilder stringBuilder = new StringBuilder();

                String sauceType = sauce instanceof FermentingSauce ? "fermenting" : "non-fermenting";
                stringBuilder.append(sauceType).append(",");

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

    public static List<Sauce> read(String filepath) {
        List<Sauce> sauces = new ArrayList<>();
        try {
            File file = new File(filepath);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                String[] splitData = data.split(",");

                String sauceType = splitData[0];

                Integer calories = Integer.parseInt(splitData[1]);
                String name = splitData[2];
                Boolean isSpicy = Boolean.parseBoolean(splitData[3]);

                if(sauceType.equalsIgnoreCase("non-fermenting")) {
                    Sauce sauce = new NonFermentingSauce(calories, name, isSpicy);
                    sauces.add(sauce);
                }
                else {
                    Integer expiryHours = Integer.parseInt(splitData[4]);
                    Sauce sauce = new FermentingSauce(calories, name, isSpicy, expiryHours);
                    sauces.add(sauce);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return sauces;
    }
}
