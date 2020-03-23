package com.aaron.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 可选的自定义对象序列化
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int score;

    private String password;

    public Student() {
    }

    public Student(int score, String password) {
        this.score = score;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //自定义序列化的方法
    private void writeObject(ObjectOutputStream out){
        StringBuffer reverse = new StringBuffer(password).reverse();
        System.out.println("加密后密码"+reverse);
        try {
            out.writeObject(reverse.toString());
        } catch (IOException e) {
            System.out.println("序列化失败");
            e.printStackTrace();
        }
    }
    //自定义反序列化的方法
    private void readObject(ObjectInputStream in){
        try {
            String reverse = (String)in.readObject();
            System.out.println("加密后密码"+reverse);
            this.password = new StringBuffer(reverse).reverse().toString();
            System.out.println("解密后的密码"+password);
        } catch (IOException e) {
            System.out.println("反序列化失败");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("类型转换异常");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", password='" + password + '\'' +
                '}';
    }
}
