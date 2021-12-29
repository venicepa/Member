package com.member.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("member")
@Getter
@ToString
@RequiredArgsConstructor
public class UserConfig {

    private final String user;

}
