package com.infosys.annotationsexample2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackage="com.infosys.annotationexample2.beans.*")
public class Config {

}
