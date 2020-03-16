package com.javaguru.lessons.lesson9;

import java.util.Objects;

class UserDetails {

    private int age;
    private String name;

    public UserDetails(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetails that = (UserDetails) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
