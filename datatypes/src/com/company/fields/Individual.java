package com.company.fields;

public class Individual {

    private String name;
    private int age = 25;

    public Individual () {

    }

    public Individual(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18 || age > 65)
            throw new IllegalArgumentException("Age is out of range");

        this.age = age;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
