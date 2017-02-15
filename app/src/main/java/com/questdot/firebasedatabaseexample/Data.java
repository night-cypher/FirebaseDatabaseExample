package com.questdot.firebasedatabaseexample;

/**
 * Created by Bakhtiyar on 12/30/2016.
 */
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
