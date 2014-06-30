package com.moecode.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceholderController {

    @RequestMapping("/hold")
    public @ResponseBody
    Placeholder hold() {
        return new Placeholder(1);
    }
}
