package com.member.service;

import com.member.config.MemberConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Member {

    private final MemberConfig memberConfig;

    @Autowired
    public Member(MemberConfig memberConfig) {
        this.memberConfig = memberConfig;
    }

    public String getUser() {
        return memberConfig.getUserConfig().getUser();
    }
}
