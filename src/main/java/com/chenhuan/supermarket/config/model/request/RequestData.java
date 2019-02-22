package com.chenhuan.supermarket.config.model.request;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description: 前台参数请求实体
 * @Author: 陈欢
 * @Date: 2019/2/22 10:35
 */
public class RequestData implements Serializable {

    private JSONObject data;
    private String ip;
    private String url;

    public RequestData() {
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public <T> T parse(Class<T> clazz) {
        return this.data.toJavaObject(clazz);
    }

    public <T> T parse(String key, Class<T> clazz) {
        return this.data.getObject(key, clazz);
    }

    public String[] getStringArray(String key) {
        String values = this.data.getString(key);
        return StringUtils.isEmpty(values) ? new String[0] : values.split(",");
    }

    public Object[] getObjectArray(String key) {
        JSONArray jsonArray = this.data.getJSONArray(key);
        return jsonArray != null ? jsonArray.toArray() : new Object[0];
    }

    public <T> T[] getArray(String key, T[] array) {
        JSONArray jsonArray = this.data.getJSONArray(key);
        return jsonArray != null ? jsonArray.toArray(array) : array;
    }

    public <T> List getList(String key, Class<T> clazz) {
        JSONArray jsonArray = this.data.getJSONArray(key);
        return (List) (jsonArray != null ? jsonArray.toJavaList(clazz) : new ArrayList<>());
    }

    public Object get(String key) {
        return this.data.get(key);
    }

    public String getString(String key) {
        return this.data.getString(key);
    }

    public Integer getInteger(String key) {
        return this.data.getInteger(key);
    }

    public Long getLong(String key) {
        return this.data.getLong(key);
    }

    public Map<String, Object> parseMap() {
        return this.data.toJavaObject(Map.class);
    }

}
