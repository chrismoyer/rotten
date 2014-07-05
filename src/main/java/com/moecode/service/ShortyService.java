package com.moecode.service;

import com.moecode.model.Shorty;

public interface ShortyService {

    public Shorty getShortyByUrl(String url);
    public Shorty getShortyById(String id);
}
