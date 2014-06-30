package com.moecode.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by moe on 6/29/14.
 */

@RestController
public class DerpController {

    @RequestMapping("/derp")
    public @ResponseBody Derp derp() {
        return new Derp(1);
    }
}
