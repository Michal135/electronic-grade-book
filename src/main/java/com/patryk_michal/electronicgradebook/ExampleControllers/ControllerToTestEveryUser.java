package com.patryk_michal.electronicgradebook.ExampleControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerToTestEveryUser {

    //jak bedziemy konfigurowac Spring Security, to te metody beda widzalne w zaleznosci kto bedzie zalogowany
    //teraz mozne kazdy pod nie wbic

    @GetMapping("/headAdmin")
    public String onlyVisibleToHeadAdmin(){
        return "HeadAdmin";
    }

    @GetMapping("/admin")
    public String onlyVisibleToAdmin(){
        return "Admin";
    }

    @GetMapping("/teacher")
    public String onlyVisibleToTeacher(){
        return "Teacher";
    }

    @GetMapping("/parent")
    public String onlyVisibleToParent(){
        return "Parent";
    }

    @GetMapping("/student")
    public String onlyVisibleToStudent(){
        return "Student";
    }



}