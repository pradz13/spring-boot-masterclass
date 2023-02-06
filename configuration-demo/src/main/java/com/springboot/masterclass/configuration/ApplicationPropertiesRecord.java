package com.springboot.masterclass.configuration;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationPropertiesRecord(String version, FtpProperties ftp) {

    public record FtpProperties(@NotEmpty String host,
                                @Positive int port,
                                @NotEmpty String user,
                                @NotEmpty String password) {

    }
}
