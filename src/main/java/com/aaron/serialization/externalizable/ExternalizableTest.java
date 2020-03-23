package com.aaron.serialization.externalizable;

import java.io.*;

public class ExternalizableTest {
    public static void main(String[] args) throws Exception{
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("teacher.txt"));
        Teacher teacher = new Teacher("张老师",1);
        output.writeObject(teacher);
        Teacher teacher1 = (Teacher) objectInput.readObject();
        System.out.println(teacher1);

    }
}
