package com.springboot.masterclass.configuration;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public class ApplicationProperties {
    private final String version;

    private final FtpProperties ftp;

    public ApplicationProperties(String version, FtpProperties ftp) {
        this.version = version;
        this.ftp = ftp;
    }

    public String getVersion() {
        return version;
    }

    public FtpProperties getFtp() {
        return ftp;
    }

    public static class FtpProperties {
        @NotEmpty
        private final String host;
        @Positive
        private final int port;
        @NotEmpty
        private final String user;
        @NotEmpty
        private final String password;

        public FtpProperties(String host, int port, String user, String password) {
            this.host = host;
            this.port = port;
            this.user = user;
            this.password = password;
        }

        public String getHost() {
            return host;
        }

        public int getPort() {
            return port;
        }

        public String getUser() {
            return user;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "FtpProperties{" +
                    "host='" + host + '\'' +
                    ", port='" + port + '\'' +
                    ", user='" + user + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ApplicationProperties{" +
                "version='" + version + '\'' +
                ", ftp=" + ftp +
                '}';
    }
}
