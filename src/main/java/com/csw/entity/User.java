package com.csw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)

@Component
@ConfigurationProperties(prefix = "users")
public class User {
    private String id;
    private String namea;
    private Integer age;
    private Date bir;
    private Map<String, String> maps;
}
