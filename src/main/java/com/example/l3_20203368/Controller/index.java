package com.example.l3_20203368.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
    @GetMapping(value = "")
    public String index(){
        return "";
    }
}
