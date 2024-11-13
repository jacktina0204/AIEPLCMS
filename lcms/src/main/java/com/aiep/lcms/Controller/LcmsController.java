package com.aiep.lcms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Tip : @RestController = @Controller + @ResponseBody
public class LcmsController {

    @GetMapping("/api/DashBoard")
    public String test() {
        return "Lcms DashBoard";
    }
}
