package com.itheima.dao.Impl;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hamcrest.core.IsEqual;

import java.util.List;

public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        // 1. 使用工厂创建SqlSession
        SqlSession session = factory.openSession();
        // 2. 使用session执行查询所有的方法
        List<User> users =  session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        // 3. 返回查询结果
        return users;
    }
}
