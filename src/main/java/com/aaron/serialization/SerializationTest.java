package com.aaron.serialization;

import java.io.*;
import java.util.Date;

/**
 * 序列化相关测试
 */
public class SerializationTest implements Serializable {


    public static void main(String[] args) throws Exception {
        //testNotSerializable();//java.io.NotSerializableException: com.aaron.serialization.Person
        //testWriteObject();
//        testReadObject();
        testCustomSerializable();
    }

    private static void testCustomSerializable() throws Exception{
        Student s = new Student();
        s.setScore(100);
        s.setPassword("12345678");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
        objectOutputStream.writeObject(s);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.txt"));
        Student ss = (Student) objectInputStream.readObject();
        System.out.println(ss);

    }

    private static void testReadObject() throws  Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"));
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
    }

    public static void testNotSerializable() throws Exception{
        Student s = new Student();
        s.setScore(100);
        //序列化 把对象写入到 IO流中 没有实现java序列化Serializable接口
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
        objectOutputStream.writeObject(s);
    }

    public static void testWriteObject() throws  Exception{
        Person p = new Person();
//        p.setAge(21);
        p.setBirthday(new Date());
       // p.setName("张三");
        //序列化 把对象写入到 IO流中 没有实现java序列化Serializable接口
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
        objectOutputStream.writeObject(p);
    }

}
