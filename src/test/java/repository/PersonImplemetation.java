package repository;

import config.PostgresConfig;
import data.DataPersonSql;
import model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonImplemetation implements PersonRepository {
    @Override
    public void save(Person person) throws SQLException {
        try(Connection connection = PostgresConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DataPersonSql.Create_Person)) {
            preparedStatement.execute();


        }

    }


    @Override
    public Person findById(long id) {
        return null;
    }

    @Override
    public void personIntoTable(Person person) {
        try (Connection connection = PostgresConfig.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(DataPersonSql.INSERT_INTO)) {

            statement.setString(1, person.getUserName());
            statement.setInt(2, person.getAge());
            statement.setString(3, person.getDiscriptions());

            int result = statement.executeUpdate();



            System.out.println("Добавлено строк: " + result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
