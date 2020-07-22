package models;

import java.util.List;

public interface Contacts {
    long save(Contact contactToSave);
    List<Contact> findAll();
}
