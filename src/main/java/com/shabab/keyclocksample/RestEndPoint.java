package com.shabab.keyclocksample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoint {


    @RequestMapping("/visitor")
    public String getVisitorPath() {
        return "Hello Visitor!";
    }

    @RequestMapping("/admin")
    public String getAdminPath() {
        return "Hello Admin!";
    }






}
