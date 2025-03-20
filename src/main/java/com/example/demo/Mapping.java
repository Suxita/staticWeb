package com.example.demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Mapping implements WebMvcConfigurer {
    @Override
    public void  addViewControllers(ViewControllerRegistry registry){


        registry.addViewController("/").setViewName("index");
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/contact").setViewName("contact");
        registry.addViewController("/recipes").setViewName("recipes");
        registry.addViewController("/about").setViewName("about");




        registry.addRedirectViewController("/home","/");
        registry.addRedirectViewController("/about-us","about");
        registry.addRedirectViewController("/contact-us","contact");


    }
}
