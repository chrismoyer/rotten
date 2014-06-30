package com.moecode.service;

import com.moecode.model.Shorty;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleShortyService implements ShortyService {

    private Map<String, Shorty> store = new ConcurrentHashMap<>();
    private long index = 0;

    @Override
    public Shorty getShorty(String url) {
        return null;
    }
}
