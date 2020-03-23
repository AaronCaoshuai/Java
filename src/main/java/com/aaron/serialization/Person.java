package com.aaron.serialization;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    //显示制定serialVersionUID 可以最大程度上保证序列化成功
    //如果新类中实例变量的类型与序列化时类的类型不一致，
    //则会反序列化失败，这时候需要更改serialVersionUID
    //如果只是新增了实例变量，则反序列化回来新增的是默认值；
    // 如果减少了实例变量，反序列化时会忽略掉减少的实例变量
    private final static long serialVersionUID = 1L;

//    private String name;
    private String age;
    private transient Date birthday1;
    private String address;
    private int sex;
    private String newVar;

    public String getNewVar(){
        return newVar;
    }

    public int getSex1() {
        System.out.println(123);
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday1;
    }

    public void setBirthday(Date birthday) {
        this.birthday1 = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +

                ", age=" + age +
                ", birthday=" + birthday1 +
                '}';
    }
}
