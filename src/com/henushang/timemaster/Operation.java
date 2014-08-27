package com.henushang.timemaster;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2014/8/27.
 */
public class Operation {
    public static String getTime(){
        try {
            Class<?> serviceManager = Class.forName("android.os.ServiceManager");
            Method[] methods = serviceManager.getMethods();
            String result = "";
            for(Method item : methods) {
                result += item.getName() +  "\r\n";
            }
            return result;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
