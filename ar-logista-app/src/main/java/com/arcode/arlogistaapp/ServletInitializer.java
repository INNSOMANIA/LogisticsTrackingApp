package com.arcode.arlogistaapp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(
        basePackages = {
                "com.arcode.ar-logista-app.client",
                "com.arcode.ar-logista-app.driver",
                "com.arcode.ar-logista-app.route",
                "com.arcode.ar-logista-app.vehicle",
                "com.arcode.ar-logista-app.operation"
        })
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ArLogistaAppApplication.class);
    }
}
