package com.example.ryojitakeda.javalog;

import android.util.Log;

/**
 * Created by ryojitakeda on 2018/01/11.
 */

public class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String hobby, String name, int age) {
        this.hobby = hobby;
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        Log.d("javatest", "私の名前は" + name + "です。年は" + age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");
    }
}
