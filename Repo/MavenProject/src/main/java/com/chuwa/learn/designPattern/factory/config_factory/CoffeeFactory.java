package com.chuwa.learn.designPattern.factory.config_factory;

import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static HashMap<String,Coffee> map = new HashMap<String,Coffee>();

    static {
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            Set<Object> keys = p.keySet();
            for (Object key:keys){
                String className = p.getProperty((String) key);
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
                map.put((String)key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name){
        return map.get(name);

    }
}