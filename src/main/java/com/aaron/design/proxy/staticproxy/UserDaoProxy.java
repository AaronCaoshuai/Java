package com.aaron.design.proxy.staticproxy;

/**
 * 接口代理对象
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao  userDao;

    public UserDaoProxy(IUserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
