package ru.kesha.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/")
    public String infoForAllEmployees() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String infoOnlyForHR() {
        return "view_for_hr";
    }

    @GetMapping("/managers_info")
    public String infoOnlyForManagers() {
        return "view_for_managers";
    }
}
