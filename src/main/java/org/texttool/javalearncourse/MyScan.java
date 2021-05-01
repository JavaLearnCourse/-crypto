package org.texttool.javalearncourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.texttool.javalearncourse")
//@ImportResource(locations = {"classpath:values.properties"})
@PropertySource(name="myProperties", value = "values.properties")
public class MyScan {
}
