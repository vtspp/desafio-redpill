package br.com.github.vtspp.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan (basePackages = "br.com.github.vtspp.domain")
@SpringBootApplication (scanBasePackages = "br.com.github.vtspp.*")
@EnableJpaRepositories (basePackages = "br.com.github.vtspp.repository")
public class DesafioRedpillApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioRedpillApplication.class, args);
    }

}