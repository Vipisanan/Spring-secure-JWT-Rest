package com.example.demo.Controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class Hello {


    @RequestMapping("/user")
    public String welcomeUser()
    {
        return "User has successfully logged in!!!";

    }

    @RequestMapping("/admin")
    public String welcomeAdmin()
    {
        return "Admin has successfully logged in!!!";
    }

    @GetMapping("/test-admin")
    public String hello(@AuthenticationPrincipal UserDetails userDetails) {
//        String username = userDetails.getUsername();
//        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
//        authorities
//                .forEach(System.out::println);
        System.out.println("this is admin URL---------------------------------------------");
        return "hi admin vipi!";
    }

    @GetMapping("/test-user")
    public String hellouser() {
        System.out.println("this is user URL----------------------------------------------");
        return "hi user vipi!";
    }

    @GetMapping("/anyone")
    public String helloanyone() {
        System.out.println("this is anyOne URL----------------------------------------------");
        return "hi anyOne user!";
    }
}

