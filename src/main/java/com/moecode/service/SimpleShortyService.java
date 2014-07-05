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
    public Shorty getShortyByUrl(String url) {
        Shorty s = new Shorty();
        s.setId(Long.toString(++index));
        s.setUrl(url);

        store.put(s.getId(), s);

        return s;
    }

    @Override
    public Shorty getShortyById(String id) {
        return store.get(id);
    }
}
