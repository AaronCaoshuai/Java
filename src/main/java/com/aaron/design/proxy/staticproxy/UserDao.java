package com.aaron.design.proxy.staticproxy;

/**
 * 接口实现类
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
