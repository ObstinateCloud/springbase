package com.lengedyun.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author zjy
 * @title: ElConfig
 * @projectName springbase
 * @description: El表达式配置类
 * @date 2020/5/29 7:40
 */

@Configuration
@ComponentScan("com.lengedyun.el")
//需要在pom>build中配置 resources编译 src/main/java下的配置文件
@PropertySource("classpath:com/lengedyun/el/eltest.properties")
//@PropertySource("classpath:asset/eltest1.properties")
public class ElConfig {

    @Value("I Love You")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random()*100}")
    private double randomNumber;

    @Value("#{demoElService.author}")
    private String fromAnother;

    @Value("classpath:com/lengedyun/el/eltest2.txt")
    //@Value("classpath:asset/eltest22.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){

        System.out.println("normal:"+normal);
        System.out.println("osName:"+osName);
        System.out.println("randomNumber:"+randomNumber);
        System.out.println("fromAnother:"+fromAnother);
        System.out.println("bookName:"+bookName);
        System.out.println("book.author:"+environment.getProperty("book.author"));
        try {
            System.out.println("testFile:"+ IOUtils.toString(testFile.getInputStream()));
            System.out.println("testUrl:"+ IOUtils.toString(testUrl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
