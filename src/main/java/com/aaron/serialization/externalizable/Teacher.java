package com.aaron.serialization.externalizable;

import java.io.*;

public class Teacher implements Externalizable {


    private String name;
    private int level;

    public Teacher() {
    }

    public Teacher(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    //自定义实现序列化
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //加解密
        StringBuffer reverse = new StringBuffer(name).reverse();
        System.out.println(reverse.toString());
        out.writeObject(reverse);
        out.writeInt(level);
    }
    //反序列化
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //加解密
        this.name = ((StringBuffer) in.readObject()).reverse().toString();
        System.out.println(name);
        this.level = in.readInt();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
