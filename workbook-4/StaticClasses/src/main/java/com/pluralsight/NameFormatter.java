package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {

    }
    public static String format(String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder formattedName = new StringBuilder();
        formattedName.append(lastName).append(", ");

        if (!prefix.isEmpty()) {
            formattedName.append(prefix).append(" ");
        }

        formattedName.append(firstName).append(" ");

        if (!middleName.isEmpty()) {
            formattedName.append(middleName).append(" ");
        }

        if (!suffix.isEmpty()) {
            formattedName.append(", ").append(suffix);
        }

        return formattedName.toString().trim();
    }
    public static String format(String fullName) {
        return fullName;
    }
}
