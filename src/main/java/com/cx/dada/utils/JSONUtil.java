package com.cx.dada.utils;

import com.alibaba.fastjson.JSON;


/**
 * @author ww
 */
public class JSONUtil {

    public static String toJson(Object object) {
        return object == null ? "" : JSON.toJSONString(object);
    }

    public static <T> T fromJson(String json, Class<T> tClass){
        return JSON.parseObject(json, tClass);
    }
}
