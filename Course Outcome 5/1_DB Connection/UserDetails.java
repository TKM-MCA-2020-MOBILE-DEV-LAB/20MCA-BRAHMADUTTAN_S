package com.example.workshopsqlite;

public class UserDetails {

    private int id;
    private String Name;
    private int age;
    private boolean UserStatus;

    public UserDetails(int id, String name, int age, boolean userStatus) {
        this.id = id;
        this.Name = name;
        this.age = age;
        this.UserStatus = userStatus;
    }

    public UserDetails() {
    }

    @Override
    public String toString() {
        return "MainActivity{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", UserStatus=" + UserStatus +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.UserStatus = userStatus;
    }


}
