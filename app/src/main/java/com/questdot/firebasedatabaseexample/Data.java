package com.questdot.firebasedatabaseexample;

public class Data {

    String key;

    String name;
    int age;

    public Data(String key, String name, int age) {
        this.key = key;
        this.name = name;

        this.age = age;
    }

    public Data() {
    }



    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }
}
