package com.jiyun.githab__test;

import android.util.Log;

/**
 * Created by Lenovo on 2017/8/14.
 */

public class BeanTest {
    private String name;
    private int age;
    private int gender;
    private void newMethod(){
        Log.e("TAG","Test");
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
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
