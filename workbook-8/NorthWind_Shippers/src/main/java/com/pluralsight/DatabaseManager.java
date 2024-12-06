package com.pluralsight;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private DataSource dataSource;

    public DatabaseManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void addShipper() {

    }
    public List<Shipper> displayAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        return shippers;
    }
    public void changeShipperNumber() {

    }
}
