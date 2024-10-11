package com.AthenticationGithub.AthenticationGithub;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String home() {
        return "Wellcome to the Othu2 gitHub";
    }
}
