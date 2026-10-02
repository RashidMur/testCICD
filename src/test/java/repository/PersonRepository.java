package repository;

import model.Person;

import java.sql.SQLException;

public interface PersonRepository {
    void save(Person person) throws SQLException;
    Person findById(long id);
    void personIntoTable(Person person);
}
