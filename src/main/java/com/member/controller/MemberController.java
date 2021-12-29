package com.member.controller;

import com.member.service.Member;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Pattern;
import java.util.List;

@Slf4j
@RestController
//@Profile({"local", "beta", "int", "prod"})
//@RequestMapping(path = "/member/v1", produces = MediaType.APPLICATION_JSON_VALUE)
//@Validated
public class MemberController {

    private final Member member;

    @Autowired
    public MemberController(Member member) {
        this.member = member;
    }


    @GetMapping(path = "/users/")
    public String getUser() {
        return member.getUser();
    }

    @GetMapping("/Customer")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", "Eason1");
//        mv.addObject("from", "com.jj");
        mv.setViewName("Customer");
        return mv;
    }
}
