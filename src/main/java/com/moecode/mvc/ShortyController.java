package com.moecode.mvc;

import com.moecode.model.Shorty;
import com.moecode.service.ShortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ShortyController {

    @Autowired
    private ShortyService shortyService;

    @RequestMapping(value = "/s", method = RequestMethod.POST)
    public @ResponseBody Shorty createShorty(String url) {
        return shortyService.getShortyByUrl(url);
    }

    @RequestMapping(value= "/s/{id}")
    public void getShorty(@PathVariable String id, HttpServletResponse response) throws IOException {
        Shorty s = shortyService.getShortyById(id);

        if (s == null) {
            response.sendRedirect("/resources/nope.html");
        } else {
            response.sendRedirect(s.getUrl());
        }
    }
}
