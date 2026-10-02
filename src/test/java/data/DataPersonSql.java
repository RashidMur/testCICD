package data;

public class DataPersonSql {
    public static final String Create_Person = """
            Create table if not exists Person(id SERIAL PRIMARY KEY ,userName VARCHAR(100), age INTEGER, description VARCHAR(300) )
            """;
    public static final String INSERT_INTO = """
            Insert Into Person(userName,age,description) VALUES(?, ?, ?)
            """;
}
