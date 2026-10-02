package model;

public class Person {
    long id;
    String userName;

    public Person(String userName, int age, String discriptions) {
        this.userName = userName;
        this.age = age;
        this.discriptions = discriptions;
    }

    int age;
    String discriptions;

    public Person() {
    }

    public Person(long id, String userName, int age, String discriptions) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.discriptions = discriptions;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getDiscriptions() {
        return discriptions;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiscriptions(String discriptions) {
        this.discriptions = discriptions;
    }
}
