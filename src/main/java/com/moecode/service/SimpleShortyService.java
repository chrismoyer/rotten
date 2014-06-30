package com.moecode.service;

import com.moecode.model.Shorty;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SimpleShortyService implements ShortyService {

    private Map<String, Shorty> store = new ConcurrentHashMap<>();
    private long index = 0;

    @Override
    public Shorty getShorty(String url) {
        Shorty s = new Shorty();
        s.setShorty(Long.toString(index));
        s.setUrl(url);

        store.put(s.getShorty(), s);

        return s;
    }
}
