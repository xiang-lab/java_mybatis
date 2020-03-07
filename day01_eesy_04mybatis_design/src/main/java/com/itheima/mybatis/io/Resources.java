package com.itheima.mybatis.io;

import java.io.InputStream;

/* 使用类加载器读取配置文件的类 */
public class Resources {

    /* 根据一个传入的参数，获取一个字节输入流 */
    public static InputStream getResourceAsStream(String filePath) {
        /*
        *  获取字节码
        *  获取类加载器
        *  根据类加载器读取配置
        */
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }

}
