package com.moecode.mvc;

import com.moecode.model.Shorty;
import com.moecode.service.ShortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShortyController {

    @Autowired
    private ShortyService shortyService;

    @RequestMapping(value = "/s", method = RequestMethod.POST)
    public @ResponseBody Shorty createShorty(String url) {
        return shortyService.getShortyByUrl(url);
    }

    @RequestMapping(value= "/s/{id}")
    public String getShorty(@RequestParam String id) {
        Shorty s = shortyService.getShortyById(id);
        return "redirect: " + s.getUrl();
    }
}
