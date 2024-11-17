package com.krnelx.RESTSwaggerProductManagement.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Product Management API", version = "1.0"))
public class SwaggerConfig {
}