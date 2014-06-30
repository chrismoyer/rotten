package com.moecode.mvc;

import com.moecode.model.Shorty;
import com.moecode.service.ShortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortyController {

    @Autowired
    private ShortyService shortyService;

    @RequestMapping(value = "/s", method = RequestMethod.POST)
    public @ResponseBody Shorty createShorty(String url) {
        return shortyService.getShorty(url);
    }
}
