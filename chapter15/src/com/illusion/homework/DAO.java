package com.illusion.homework;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();
    public void save(String id, T entity){}

    public T get(String id){
        return map.get(id);
    }
}
