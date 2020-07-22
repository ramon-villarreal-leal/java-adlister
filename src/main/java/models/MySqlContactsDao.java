package models;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.List;

public class MySqlContactsDao implements Contacts {

    private Connection connection;

//    public MySqlContactsDao(Config config) {
//        DriverManager.registerDriver(new Driver() {
//        });
//        this.connection = connection;
//    }

    @Override
    public long save(Contact contactToSave) {
        return 0;
    }

    @Override
    public List<Contact> findAll() {
        return null;
    }
}
