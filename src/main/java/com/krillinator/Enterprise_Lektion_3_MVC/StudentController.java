package com.krillinator.Enterprise_Lektion_3_MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController - Includes @ResponseBody & @Controller
@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentHomepage() {

        return "student.html";
    }

}
