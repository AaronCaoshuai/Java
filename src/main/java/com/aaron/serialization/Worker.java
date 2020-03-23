package com.aaron.serialization;


import java.io.*;


/**
 * 彻底的自定义序列化
 */
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String password;

    public Worker(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Worker() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

    //在序列化时，会先调用此方法，再调用writeObject方法，此方法可将任意对象代替目标序列化对象 对象已经被彻底更改了 就无法使用到了该对象中的readResolve()方法了 比如:使用ArrayList
    //如果使用的是Worker那么还是会调用该对象的readResolve()方法
    private Object writeReplace() throws ObjectStreamException {
//        List<String> list = new ArrayList<>(2);
//        list.add(this.name);
//        list.add(this.password);
//        return list;
        Worker worker = new Worker("王五", 23,"123456");
        return worker;
    }

    //序列化时替换序列化出的对象,反序列化出来的对象被立即丢弃,此方法在readObject后调用
    private Object readResolve() throws ObjectStreamException{
        return  new Worker("李四", 23,"123456");
    }
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("worker.txt"));
        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("worker.txt"));
        Worker worker = new Worker("张三", 23,"123456");
        oos.writeObject(worker);
//        ArrayList list = (ArrayList)ios.readObject();
//        System.out.println(list);
        Worker worker1 = (Worker) ios.readObject();
        System.out.println(worker1);
    }

}
