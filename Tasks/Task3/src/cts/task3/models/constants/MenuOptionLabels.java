package cts.task3.models.constants;

import java.util.List;
import java.util.stream.Stream;

public abstract class MenuOptionLabels {
    public static final List<String> MAIN_MENU_OPTIONS_LABELS = Stream.of(
            "Kebap menu",
            "Sauce menu"
    ).toList();

    public static final List<String> KEBAP_MENU_OPTIONS_LABELS = Stream.of(
            "Create kebap",
            "Delete kebap",
            "Show all kebaps",
            "Filter kebaps"
    ).toList();

    public static final List<String> SAUCE_MENU_OPTIONS_LABELS = Stream.of(
            "Create sauce",
            "Delete sauce",
            "Save sauces to file",
            "Load sauces from file"
    ).toList();
}
