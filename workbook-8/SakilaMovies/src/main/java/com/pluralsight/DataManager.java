package com.pluralsight;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actor> searchByName() {
        List<Actor> actors = new ArrayList<>();
        return actors;
    }

    public List<Film> searchByID() {
        List<Film> films = new ArrayList<>();
        return films;
    }
}
