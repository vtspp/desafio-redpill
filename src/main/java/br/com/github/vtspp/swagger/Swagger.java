package br.com.github.vtspp.swagger;

import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Component
public class Swagger {

    protected Docket api () {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("User Manager - RedPill")
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.github.vtspp"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData () {
        return new ApiInfoBuilder()
                .title("User Manager API")
                .description("Challenge carried out by the company RedPill")
                .version("0.0.1")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Victor Dos Santos Pinho", null,  "vtsppinho@gmail.com"))
                .build();
    }
}