package com.walle.walle2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaldenController {

    @RequestMapping("/")
    public String hi(){
        return "welcome to walle 2.0.0";
    }
}