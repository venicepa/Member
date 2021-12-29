package com.member.config;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class MemberConfig {

    private final UserConfig userConfig;

    public MemberConfig(UserConfig userConfig) {
        this.userConfig = userConfig;
    }
}
