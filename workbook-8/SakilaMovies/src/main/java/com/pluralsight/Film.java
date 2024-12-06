package com.pluralsight;

public class Film {
    private int filmID;
    private String title;
    private long description;
    private int releaseYear;
    private int length;

    public Film(int filmID, String title, long description, int releaseYear, int length) {
        this.filmID = filmID;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
    }
}
