package test;

import config.PostgresConfig;
import model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.PersonImplemetation;

import java.sql.Connection;
import java.sql.SQLException;

import static data.DataPersonSql.Create_Person;

public class PostgresTest {
    @Test
    public void testPostgres(){
        try(Connection connection = PostgresConfig.getConnection()) {
            Assertions.assertNotNull(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testUserName() throws SQLException {
        PersonImplemetation personImplemetation = new PersonImplemetation();
        personImplemetation.personIntoTable(new Person("Make",22,"GREgdrhdtyj"));
    }
}
